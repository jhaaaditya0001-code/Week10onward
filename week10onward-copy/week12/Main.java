
package week12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("INFORMATICS", "POKHARA", "KATHMANDU"));

        for (Student s : students) {
            System.out.println("Name: " + s.getName());
            System.out.println("Group: " + s.getGroup());
            System.out.println("Phone: " + s.getPhone());
        }
    }
}
