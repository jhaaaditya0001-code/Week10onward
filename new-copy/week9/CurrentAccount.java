package week9;
class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Withdrawal failed! Limit exceeded.");
            return false;
        }
    }
}
