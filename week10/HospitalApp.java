package week10;


public class HospitalApp {
    public static void main(String[] args) {
        Doctor d = new Doctor(1, "Dr. Aaditya", 50000, "Cardiology", 15000);
        Nurse n = new Nurse(2, "Aaditya ko Baby", 30000, "Night", 5000);

        System.out.println(d);
        System.out.println("Doctor Salary with emergencies: " + d.calculateSalary(3));
        System.out.println(n);
    }
}
