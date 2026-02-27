package week12;


import java.util.ArrayList;

public class BusCompany {
    private ArrayList<Bus> buses;

    public BusCompany() {
        buses = new ArrayList<>();
    }

    public void addBus(Bus bus) {
        buses.add(bus);
    }

    public void removeBus(int index) {
        if (index < 0 || index >= buses.size()) {
            System.out.println("Error: Invalid index");
        } else {
            buses.remove(index);
        }
    }

    public void displayBuses() {
        for (Bus bus : buses) {
            System.out.println(bus.getDescription());
        }
    }
}
