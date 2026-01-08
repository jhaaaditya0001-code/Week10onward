package week10;


// Parent Class
class Order {
    private int id;
    private String customer;
    private double totalAmount;

    // Constructor
    public Order(int id, String customer, double totalAmount) {
        this.id = id;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCustomer() { return customer; }
    public void setCustomer(String customer) { this.customer = customer; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    // Calculate final amount (can be overridden)
    public double calculateFinalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Order ID: " + id + ", Customer Name: " + customer + ", Total Amount: " + totalAmount;
    }
}

// Child Class: NormalOrder
class NormalOrder extends Order {

    public NormalOrder(int id, String customer, double totalAmount) {
        super(id, customer, totalAmount);
    }

    @Override
    public double calculateFinalAmount() {
        // Normal order has no discount or extra charges
        return super.calculateFinalAmount();
    }
}

// Child Class: PremiumOrder
class PremiumOrder extends Order {
    private double discountRate; // discount in currency

    public PremiumOrder(int id, String customer, double totalAmount, double discountRate) {
        super(id, customer, totalAmount);
        this.discountRate = discountRate;
    }

    public double getDiscountRate() { return discountRate; }
    public void setDiscountRate(double discountRate) { this.discountRate = discountRate; }

    // Override method to include discount
    @Override
    public double calculateFinalAmount() {
        return super.calculateFinalAmount() - discountRate;
    }

    // Overloaded method: extra discount dynamically
    public double calculateFinalAmount(double extraDiscount) {
        return super.calculateFinalAmount() - discountRate - extraDiscount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Discount: " + discountRate;
    }
}
