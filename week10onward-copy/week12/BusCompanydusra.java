package week12;

import java.util.ArrayList;

public class BusCompanydusra {
    ArrayList<Busdusra> buses = new ArrayList<>();

    public void addBus(Busdusra b) {
        buses.add(b);
    }

    public void displayHighRateBuses() {
        for (Busdusra b : buses) {
            if (b.getRate() > 500) {
                System.out.println(b.toString());
            }
        }
    }

    public void displayRedOrBlueBuses() {
        for (Busdusra b : buses) {
            if (b.getColor().equalsIgnoreCase("red") || b.getColor().equalsIgnoreCase("blue")) {
                System.out.println(b.toString());
            }
        }
    }
}


