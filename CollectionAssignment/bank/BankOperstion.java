package CollectionAssignment.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankOperstion {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBank Application Menu:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Check Balance");
            System.out.println("5. List All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter Account Number: ");
                String accountNumber = scanner.nextLine();
                System.out.print("Enter Account Holder Name: ");
                String accountHolder = scanner.nextLine();

                BankAccount newAccount = new BankAccount(accountNumber, accountHolder);
                accounts.add(newAccount);
                System.out.println("Account created successfully!");
            } else if (choice == 2) {
                System.out.print("Enter Account Number: ");
                String depositAccountNumber = scanner.nextLine();
                System.out.print("Enter Deposit Amount: ");
                double depositAmount = scanner.nextDouble();

                boolean accountFound = false;
                for (BankAccount account : accounts) {
                    if (account.getAccountNumber().equals(depositAccountNumber)) {
                        account.deposit(depositAmount);
                        accountFound = true;
                        break;
                    }
                }

                if (!accountFound) {
                    System.out.println("Account with the provided ID not found.");
                }
            } else if (choice == 3) {
                System.out.print("Enter Account Number: ");
                String withdrawAccountNumber = scanner.nextLine();
                System.out.print("Enter Withdrawal Amount: ");
                double withdrawAmount = scanner.nextDouble();

                boolean accountFound = false;
                for (BankAccount account : accounts) {
                    if (account.getAccountNumber().equals(withdrawAccountNumber)) {
                        account.withdraw(withdrawAmount);
                        accountFound = true;
                        break;
                    }
                }

                if (!accountFound) {
                    System.out.println("Account with the provided ID not found.");
                }
            } else if (choice == 4) {
                System.out.print("Enter Account Number: ");
                String checkBalanceAccountNumber = scanner.nextLine();

                boolean accountFound = false;
                for (BankAccount account : accounts) {
                    if (account.getAccountNumber().equals(checkBalanceAccountNumber)) {
                        System.out.println("Balance: $" + account.getBalance());
                        accountFound = true;
                        break;
                    }
                }

                if (!accountFound) {
                    System.out.println("Account with the provided ID not found.");
                }
            } else if (choice == 5) {
                System.out.println("\nAll Accounts:");
                for (BankAccount account : accounts) {
                    System.out.println(account);
                }
            } else if (choice == 6) {
                System.out.println("Exiting Bank Application. Goodbye!");
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
