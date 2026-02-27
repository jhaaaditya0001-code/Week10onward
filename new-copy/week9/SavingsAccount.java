package week9;

class SavingsAccount extends BankAccount {
    double interestRate; // in percentage

    SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}
