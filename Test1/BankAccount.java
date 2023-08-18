package Test1;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String ownerName;
    public BankAccount(int accountNumber,String ownerName){
                this.accountNumber=accountNumber;
                this.balance=0;
                this.ownerName=ownerName;
    }
    public boolean depositing(double amount){
        if(amount>0){
            balance = balance+amount;
            return true;

        }else {
            return false;
        }
    }
    public boolean withdrawing(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;

        } else {
            return false;
        }
    }
        public double gettingBalance(){
            return balance;

        }
        public static void main(String[] args){
            BankAccount BA=new BankAccount(123456,"Suraj");
            BA.depositing(2000);
            System.out.println("Current Balance after deposit "+BA.gettingBalance());
            BA.withdrawing(1500);
            System.out.println("Remaining Balance after withdraw "+BA.gettingBalance());
        }
    }

