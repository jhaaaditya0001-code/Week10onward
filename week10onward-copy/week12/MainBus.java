package week12;

public class Mainbus {
    public static void main(String[] args) {
        BusCompanydusra company = new BusCompanydusra();

        company.addBus(new Busdusra("NA-1234", "Red", "Pokhara", "Ram", true, 600));
        company.addBus(new Busdusra("NA-5678", "Blue", "Kathmandu", "Shyam", false, 450));
        company.addBus(new Busdusra("NA-9876", "Black", "Biratnagar", "Hari", true, 700));
        company.addBus(new Busdusra("NA-1122", "Red", "Itahari", "Sita", true, 400));

        company.displayHighRateBuses();
        company.displayRedOrBlueBuses();
    }
}


