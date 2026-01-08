package week10;

public class SavingsAccount extends Account {

    public SavingsAccount(int accountNo, String holderName, double balance) {
        super(accountNo, holderName, balance);
    }

    // Override method
    @Override
    double calculateInterest() {
        return super.calculateInterest() + 1000; // bonus interest
    }
}
