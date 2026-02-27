package week9;

public class BankApp {
    public static void main(String[] args) {

        // Savings Account
        SavingsAccount sa = new SavingsAccount(101, "AADITYA", 50000, 5);
        System.out.println("Savings Account:");
        sa.deposit(10000);
        System.out.println("Current Balance: " + sa.getBalance());
        System.out.println("Interest: " + sa.calculateInterest());

        System.out.println();

        // Current Account
        CurrentAccount ca = new CurrentAccount(201, "RAM", 20000, 5000);
        System.out.println("Current Account:");
        ca.deposit(5000);
        System.out.println("Current Balance: " + ca.getBalance());
        ca.withdraw(22000); // allowed
        System.out.println("Balance after withdrawal: " + ca.getBalance());
        ca.withdraw(5000); // exceeds overdraft
        System.out.println("Balance after withdrawal attempt: " + ca.getBalance());
    }
}
