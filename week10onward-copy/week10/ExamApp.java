package week10;


public class ExamApp {
    public static void main(String[] args) {
        ScienceStudent s = new ScienceStudent(1, "ADITYA", 42);
        ManagementStudent m = new ManagementStudent(2, "HERO", 33);

        System.out.println(s);
        System.out.println("After Grace: " + s.calculateResult(5));
        

        System.out.println(m);
        System.out.println("After Grace: " + m.calculateResult(3));
    }
}