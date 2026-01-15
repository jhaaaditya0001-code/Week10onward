package week11;


public class Maize extends Crop implements Transportable {

    double yieldPerHectare;
    double waterPerHectare;

    public Maize(double landArea, double yieldPerHectare, double waterPerHectare) {
        super("Maize", "Hill-friendly", landArea);
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
        return landArea * 400;
    }

    @Override
    public String getTransportMethod() {
        return "Mule, porter, or small jeep";
    }
}
