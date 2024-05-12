package question2;

import java.util.InputMismatchException;
import java.util.Scanner;

class LoanRequest {
    private static final double INTEREST_RATE = 14.5 / 100; // Interest rate (14.5%)
    private static final double SALARY_DEDUCTION_RATE = 0.5; // Deduct 50% of salary
    private static final double MIN_SALARY = 800000;
    private static final double MAX_SALARY = 900000;
    private static final int MAX_LOAN_PERIOD_YEARS = 20;
    private static final int MONTHS_IN_YEAR = 12;

    private double salary;
    private int loanPeriodYears;

    public LoanRequest(double salary, int loanPeriodYears) {
        this.salary = salary;
        this.loanPeriodYears = loanPeriodYears;
    }

    public double calculateMonthlyPayment() {
        double loanAmount = calculateLoanAmount();
        double monthlyInterestRate = INTEREST_RATE / MONTHS_IN_YEAR;
        int totalPayments = loanPeriodYears * MONTHS_IN_YEAR;

        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -totalPayments));
        return monthlyPayment;
    }

    public double calculateTotalLoanAmount() {
        return calculateMonthlyPayment() * loanPeriodYears * MONTHS_IN_YEAR;
    }

    public double calculateTotalPayments() {
        return calculateTotalLoanAmount() + calculateTotalInterest();
    }

    private double calculateTotalInterest() {
        return calculateTotalLoanAmount() - calculateLoanAmount();
    }

    private double calculateLoanAmount() {
        double deductedSalary = salary * SALARY_DEDUCTION_RATE;
        return deductedSalary * loanPeriodYears;
    }
}
