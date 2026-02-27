package week9;


class Car extends Vehicle {
    int numberOfDoors;
    String fuelType;

    Car(int vehicleId, String brand, double basePrice, int numberOfDoors, String fuelType) {
        super(vehicleId, brand, basePrice);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    double calculateFinalPrice() {
        return basePrice + calculateTax() + (basePrice * 0.05);
    }
}