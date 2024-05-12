package question3;

import java.util.ArrayList;
import java.util.List;

class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    public double calculateTotalInterest() {
        double totalInterest = 0;
        for (Account account : accounts) {
            totalInterest += account.calculateInterest();
        }
        return totalInterest;
    }

    public void viewBalances() {
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println("Account " + (i + 1) + " balance: $" + accounts.get(i).getBalance());
        }
    }
}