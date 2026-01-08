package week10;


public class Account {

    protected int accountNo;
    protected String holderName;
    protected double balance;

    public Account(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Method to calculate interest
    double calculateInterest() {
        return balance * 0.03; // 3% default interest
    }

    // Overloaded method
    double calculateInterest(double rate) {
        return balance * rate / 100;
    }

    @Override
    public String toString() {
        return "Account No: " + accountNo +
               ", Holder: " + holderName +
               ", Balance: " + balance;
    }
}
