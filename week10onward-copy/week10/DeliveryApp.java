package week10;


public class DeliveryApp {
    public static void main(String[] args) {
        BikeDelivery b = new BikeDelivery(101, "Ramesh", 15000);
        CarDelivery c = new CarDelivery(102, "Suresh", 20000);

        System.out.println(b);
        System.out.println("Bike Payment with extra orders: " + b.calculatePayment(5));

        System.out.println(c);
        System.out.println("Car Payment with extra orders: " + c.calculatePayment(3));
    }
}