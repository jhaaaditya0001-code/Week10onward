package week18;

import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JFrame {

    public RegistrationForm() {

        setTitle("Student Registration Form");
        setSize(500, 400);

        JLabel nameLabel = new JLabel("Student Name:");
        nameLabel.setBounds(50, 50, 120, 30);

        JTextField nameField = new JTextField();
        nameField.setBounds(180, 50, 150, 30);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(50, 90, 120, 30);

        JTextField ageField = new JTextField();
        ageField.setBounds(180, 90, 150, 30);

        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(50, 130, 120, 30);

        JTextField phoneField = new JTextField();
        phoneField.setBounds(180, 130, 150, 30);

        JLabel deptLabel = new JLabel("Department:");
        deptLabel.setBounds(50, 170, 120, 30);

        String[] departments = {"IT","Networking","Business","Cyber Security","AI","Data Science","Marketing","Finance","Law","Design","Media","Engineering"};
        JComboBox deptBox = new JComboBox(departments);
        deptBox.setBounds(180, 170, 150, 30);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 210, 120, 30);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(180, 210, 70, 30);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(250, 210, 80, 30);

        JRadioButton other = new JRadioButton("Other");
        other.setBounds(330, 210, 80, 30);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        JLabel hobbyLabel = new JLabel("Hobbies:");
        hobbyLabel.setBounds(50, 250, 120, 30);

        JCheckBox music = new JCheckBox("Music");
        music.setBounds(180, 250, 80, 30);

        JCheckBox sports = new JCheckBox("Sports");
        sports.setBounds(260, 250, 80, 30);

        JCheckBox reading = new JCheckBox("Reading");
        reading.setBounds(340, 250, 90, 30);

        setLayout(null);

        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(phoneLabel);
        add(phoneField);
        add(deptLabel);
        add(deptBox);
        add(genderLabel);
        add(male);
        add(female);
        add(other);
        add(hobbyLabel);
        add(music);
        add(sports);
        add(reading);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        RegistrationForm rf = new RegistrationForm();
        rf.setVisible(true);
    }
}