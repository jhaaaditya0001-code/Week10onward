package week17;

public class Student {

    private String studentId;
    private String name;
    private String course;

    public Student(String studentId, String name, String course) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
    }

    public String getFormattedDetails() {

        return "<html><center>" +
               "<h2>Student ID Card</h2>" +
               "ID: " + studentId + "<br>" +
               "Name: " + name + "<br>" +
               "Course: " + course +
               "</center></html>";
    }
}