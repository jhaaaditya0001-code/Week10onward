package week10;
public class ScienceStudent extends Student {

    public ScienceStudent(int rollNo, String name, int marks) {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult() {
        return marks >= 45 ? "Pass" : "Fail";
    }

    public String calculateResult(int graceMarks) {
        marks += graceMarks;
        return calculateResult();
    }
}