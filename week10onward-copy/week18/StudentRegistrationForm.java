package week18;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

class Student {
    private int id;
    private String name;
    private String gender;
    private String skill;
    private String course;

    static ArrayList<Student> students = new ArrayList<>();

    public Student(int id, String name, String gender, String skill, String course) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.skill = skill;
        this.course = course;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getGender() { return gender; }
    public String getSkill() { return skill; }
    public String getCourse() { return course; }

    public static void addStudent(Student s) {
        for(Student st : students) {
            if(st.getId() == s.getId()) return; // ID must be unique
        }
        students.add(s);
    }

    public static void deleteStudent(int id) {
        students.removeIf(st -> st.getId() == id);
    }

    public static Object[][] viewStudents() {
        Object[][] data = new Object[students.size()][5];
        for(int i=0; i<students.size(); i++) {
            Student st = students.get(i);
            data[i][0] = st.getId();
            data[i][1] = st.getName();
            data[i][2] = st.getGender();
            data[i][3] = st.getSkill();
            data[i][4] = st.getCourse();
        }
        return data;
    }
}

public class StudentRegistrationForm extends JFrame {

    JTextField txtId, txtName, txtSkill;
    JComboBox<String> cbCourse, cbGender;
    JButton btnAdd, btnReset, btnSearch, btnDelete;
    JTable table;
    DefaultTableModel model;

    public StudentRegistrationForm() {

        setTitle("Student Registration System");
        setSize(700,400);

        JLabel lblId = new JLabel("Student ID:");
        lblId.setBounds(30,30,100,25);
        txtId = new JTextField();
        txtId.setBounds(130,30,120,25);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(30,70,100,25);
        txtName = new JTextField();
        txtName.setBounds(130,70,120,25);

        JLabel lblGender = new JLabel("Gender:");
        lblGender.setBounds(30,110,100,25);
        String[] genders = {"Male","Female","Other"};
        cbGender = new JComboBox<>(genders);
        cbGender.setBounds(130,110,120,25);

        JLabel lblSkill = new JLabel("Skills:");
        lblSkill.setBounds(30,150,100,25);
        txtSkill = new JTextField();
        txtSkill.setBounds(130,150,120,25);

        JLabel lblCourse = new JLabel("Course:");
        lblCourse.setBounds(30,190,100,25);
        String[] courses = {"BSc","BBA","BIT"};
        cbCourse = new JComboBox<>(courses);
        cbCourse.setBounds(130,190,120,25);

        btnAdd = new JButton("Add");
        btnAdd.setBounds(30,230,80,30);

        btnReset = new JButton("Reset");
        btnReset.setBounds(120,230,80,30);

        btnSearch = new JButton("Search");
        btnSearch.setBounds(210,230,80,30);

        btnDelete = new JButton("Delete");
        btnDelete.setBounds(300,230,80,30);

        String[] columns = {"ID","Name","Gender","Skill","Course"};
        model = new DefaultTableModel(Student.viewStudents(), columns){
            public boolean isCellEditable(int r,int c){ return false; }
        };
        table = new JTable(model);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setBounds(300,30,370,180);

        setLayout(null);
        add(lblId); add(txtId);
        add(lblName); add(txtName);
        add(lblGender); add(cbGender);
        add(lblSkill); add(txtSkill);
        add(lblCourse); add(cbCourse);
        add(btnAdd); add(btnReset); add(btnSearch); add(btnDelete);
        add(scroll);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new StudentRegistrationForm().setVisible(true);
    }
}