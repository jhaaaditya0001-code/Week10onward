package week11;


public class FarmCalculator {
    public static void main(String[] args) {

        Crop[] farmCrops = new Crop[3];

        farmCrops[0] = new Rice(2, 4, 1200);
        farmCrops[1] = new Wheat(1.5, 3.5, 700);
        farmCrops[2] = new Maize(1, 3, 500);

        for (int i = 0; i < farmCrops.length; i++) {
            farmCrops[i].displayCropInfo();
            System.out.println("Estimated Yield: " + farmCrops[i].calculateYield() + " tons");
            System.out.println("Water Required: " + farmCrops[i].calculateWaterRequirement() + " liters");

            Transportable t = (Transportable) farmCrops[i];
            System.out.println("Transport Method: " + t.getTransportMethod());
            System.out.println("Transport Cost: Rs " + t.calculateTransportCost());

            System.out.println("---------------");
        }
    }
}
