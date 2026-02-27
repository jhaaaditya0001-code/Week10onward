

package week12;

public class Busdusra {
    private String numberPlate;
    private String color;
    private String route;
    private String customerName;
    private boolean availableStatus;
    private int rate;

    public Busdusra(String numberPlate, String color, String route, String customerName, boolean availableStatus, int rate) {
        this.numberPlate = numberPlate;
        this.color = color;
        this.route = route;
        this.customerName = customerName;
        this.availableStatus = availableStatus;
        this.rate = rate;
    }

    public String getColor() {
        return color;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Busdusra [numberPlate=" + numberPlate + ", color=" + color + ", route=" + route +
               ", customerName=" + customerName + ", availableStatus=" + availableStatus +
               ", rate=" + rate + "]";
    }
}
