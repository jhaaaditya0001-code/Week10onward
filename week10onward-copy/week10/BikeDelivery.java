package week10;


public class BikeDelivery extends DeliveryPartner {

    public BikeDelivery(int id, String name, double basePay) {
        super(id, name, basePay);
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() + 2000;
    }

    public double calculatePayment(int extraOrders) {
        return calculatePayment() + (extraOrders * 100);
    }
}
