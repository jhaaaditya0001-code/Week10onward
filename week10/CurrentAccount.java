package week10;

public class CurrentAccount extends Account {

    public CurrentAccount(int accountNo, String holderName, double balance) {
        super(accountNo, holderName, balance);
    }

    
    @Override
    double calculateInterest() {
        return super.calculateInterest(); // same as parent
    }
}
