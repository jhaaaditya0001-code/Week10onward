package week10;

public class DeliveryPartner {
    private int partnerId;
    private String name;
    private double basePay;

    public DeliveryPartner(int partnerId, String name, double basePay) {
        this.partnerId = partnerId;
        this.name = name;
        this.basePay = basePay;
    }

    public double calculatePayment() {
        return basePay;
    }

    @Override
    public String toString() {
        return "Partner ID: " + partnerId + ", Name: " + name +
               ", Payment: " + calculatePayment();
    }
}
