package Abstrastions;

abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public abstract String getAccountNumber();
    public abstract String getAccountHolderName();
    public abstract double getBalance();
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

}
class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
       this.accountNumber=accountNumber;
       this.accountHolderName=accountHolderName;
       this.balance=balance;
        this.interestRate = interestRate;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getAccountHolderName() {
        return accountHolderName;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance =balance+ amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance =balance- amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getAccountHolderName() {
        return accountHolderName;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance =balance+ amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance +overdraftLimit >=amount ) {
            balance =balance- amount;
        } else {
            System.out.println("Exceeds overdraft limit");
        }
    }
}

class Mains {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123", "John Doe", 1000.0, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount("CA456", "Jane Smith", 1500.0, 25000.0);

        savingsAccount.deposit(500);
        savingsAccount.withdraw(100);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        checkingAccount.deposit(300);
        checkingAccount.withdraw(2000);
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }
}