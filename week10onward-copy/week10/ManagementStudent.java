package week10;


public class ManagementStudent extends Student {

    public ManagementStudent(int rollNo, String name, int marks) {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult() {
        return marks >= 35 ? "Pass" : "Fail";
    }

    public String calculateResult(int graceMarks) {
        marks += graceMarks;
        return calculateResult();
    }
}