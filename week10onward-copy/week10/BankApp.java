package week10;


public class BankApp {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(101, "Aaditya Jha", 50000);
        CurrentAccount ca = new CurrentAccount(102, "Aaditya Hero", 80000);

        System.out.println(sa);
        System.out.println("Savings Interest: " + sa.calculateInterest());
        System.out.println("Savings Interest (custom rate): " + sa.calculateInterest(6));

        System.out.println(ca);
        System.out.println("Current Interest: " + ca.calculateInterest());
        System.out.println("Current Interest (custom rate): " + ca.calculateInterest(4));
    }
}
