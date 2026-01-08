package week10;


public class Student {
    private int rollNo;
    private String name;
    protected int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String calculateResult() {
        return marks >= 40 ? "Pass" : "Fail";
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name +
               ", Marks: " + marks + ", Result: " + calculateResult();
    }
}