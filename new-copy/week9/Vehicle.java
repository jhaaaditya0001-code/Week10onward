package week9;


class Vehicle {
    int vehicleId;
    String brand;
    double basePrice;

   
    Vehicle(int vehicleId, String brand, double basePrice) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.basePrice = basePrice;
    }

    
    void displayVehicleInfo() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Base Price: " + basePrice);
    }

        double calculateTax() {
        return basePrice * 0.10;
    }
}
