package question2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter salary (between 800000 and 900000): ");
            double salary = scanner.nextDouble();
            if (salary < 800000 || salary > 900000) {
                System.out.println("Salary must be between 800000 and 900000.");
                return;
            }

            System.out.println("Enter loan period in years (at most 20 years): ");
            int loanPeriodYears = scanner.nextInt();
            if (loanPeriodYears <= 0 || loanPeriodYears > 20) {
                System.out.println("Loan period must be between 1 and 20 years.");
                return;
            }

            LoanRequest loanRequest = new LoanRequest(salary, loanPeriodYears);

            double monthlyPayment = loanRequest.calculateMonthlyPayment();
            double totalLoanAmount = loanRequest.calculateTotalLoanAmount();
            double totalPayments = loanRequest.calculateTotalPayments();

            int loanPeriodMonths = loanPeriodYears * 12;

            System.out.println("\nLoan Details:");
            System.out.println("Monthly payment: $" + monthlyPayment);
            System.out.println("Total loan amount: $" + totalLoanAmount);
            System.out.println("Total payments: $" + totalPayments);
            System.out.println("Loan period in months: " + loanPeriodMonths);

        } catch (InputMismatchException e) {
            System.out.println("Input mismatch exception occurred. Please enter valid input.");
        } finally {
            scanner.close();
        }
    }
}
