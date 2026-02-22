package week12;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<Student1> students = new ArrayList<>();

        students.add(new Student1("Ayush", "L1N1", "9876543210"));
        students.add(new Student1("Rahul", "L1M1", "9876543211"));
        students.add(new Student1("Gaurav", "L1N2", "9876543212"));

        display(students);

        students.remove(2);

        display(students);

        students.add(0, new Student1("Aavaya", "L1C1", "9876543213"));

        display(students);

        students.get(2).setGroup("L1N2");

        display(students);

        students.get(1).setName("Aayush");

        display(students);
    }

    public static void display(ArrayList<Student1> list) {
        for (Student1 s : list) {
            System.out.println(s.getName() + " " + s.getGroup() + " " + s.getPhone());
        }
        System.out.println();
    }
}
