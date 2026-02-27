package week9;


class Bike extends Vehicle {
    int engineCapacity;

    Bike(int vehicleId, String brand, double basePrice, int engineCapacity) {
        super(vehicleId, brand, basePrice);
        this.engineCapacity = engineCapacity;
    }

    double calculateFinalPrice() {
        return basePrice + calculateTax();
    }
}
