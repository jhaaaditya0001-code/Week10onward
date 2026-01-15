package week11;


public class Rice extends Crop implements Transportable {

    double yieldPerHectare;
    double waterPerHectare;

    public Rice(double landArea, double yieldPerHectare, double waterPerHectare) {
        super("Rice", "Monsoon", landArea);
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
        return landArea * 500; 
    }

    @Override
    public String getTransportMethod() {
        return "Bullock cart or tractor";
    }
}
