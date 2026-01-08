package week10;


public class CarDelivery extends DeliveryPartner {

    public CarDelivery(int id, String name, double basePay) {
        super(id, name, basePay);
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() + 5000;
    }

    public double calculatePayment(int extraOrders) {
        return calculatePayment() + (extraOrders * 200);
    }
}