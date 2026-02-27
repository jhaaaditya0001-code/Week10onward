package week12;


public class Bus {
    private String busName;
    private String busType;

    public Bus(String busName, String busType) {
        this.busName = busName;
        this.busType = busType;
    }

    public String getBusName() {
        return busName;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getDescription() {
        return "Bus Name: " + busName + ", Bus Type: " + busType;
    }
}
