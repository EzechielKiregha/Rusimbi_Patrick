package question3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(2000, 500);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Select an option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. View Balances");
                System.out.println("4. Exit");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter account type (S for Savings, C for Current):");
                        char accountType = scanner.next().charAt(0);
                        Account depositAccount = accountType == 'S' ? savingsAccount : currentAccount;
                        System.out.println("Enter amount to deposit:");
                        double depositAmount = scanner.nextDouble();
                        bank.deposit(depositAccount, depositAmount);
                        break;
                    case 2:
                        System.out.println("Enter account type (S for Savings, C for Current):");
                        char withdrawAccountType = scanner.next().charAt(0);
                        Account withdrawAccount = withdrawAccountType == 'S' ? savingsAccount : currentAccount;
                        System.out.println("Enter amount to withdraw:");
                        double withdrawAmount = scanner.nextDouble();
                        bank.withdraw(withdrawAccount, withdrawAmount);
                        break;
                    case 3:
                        bank.viewBalances();
                        break;
                    case 4:
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch exception occurred. Please enter valid input.");
        }
    }
}