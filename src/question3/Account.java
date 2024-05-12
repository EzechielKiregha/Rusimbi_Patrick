package question3;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double getBalance();
}