package week11;


public class Wheat extends Crop implements Transportable {

    double yieldPerHectare;
    double waterPerHectare;

    public Wheat(double landArea, double yieldPerHectare, double waterPerHectare) {
        super("Wheat", "Winter", landArea);
        this.yieldPerHectare = yieldPerHectare;
        this.waterPerHectare = waterPerHectare;
    }

    @Override
    public double calculateYield() {
        return yieldPerHectare * landArea;
    }

    @Override
    public double calculateWaterRequirement() {
        return waterPerHectare * landArea;
    }

    @Override
    public double calculateTransportCost() {
        return landArea * 300;
    }

    @Override
    public String getTransportMethod() {
        return "Tractor or rural truck";
    }
}
