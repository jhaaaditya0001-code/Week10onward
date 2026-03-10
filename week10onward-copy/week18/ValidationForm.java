package week18;

import javax.swing.*;
import java.awt.*;

public class ValidationForm extends JFrame {

    JTextField nameField, ageField, phoneField;
    JButton btn;

    public ValidationForm() {

        setTitle("Input Validation");
        setSize(400,300);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50,50,100,30);

        nameField = new JTextField();
        nameField.setBounds(150,50,150,30);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(50,90,100,30);

        ageField = new JTextField();
        ageField.setBounds(150,90,150,30);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(50,130,100,30);

        phoneField = new JTextField();
        phoneField.setBounds(150,130,150,30);

        btn = new JButton("Submit");
        btn.setBounds(150,180,100,30);

        btn.addActionListener(e -> validateInput());

        setLayout(null);
        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(phoneLabel);
        add(phoneField);
        add(btn);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void validateInput() {

        String name = nameField.getText();
        String age = ageField.getText();
        String phone = phoneField.getText();

        if(name.isEmpty() || age.isEmpty() || phone.isEmpty()){
            JOptionPane.showMessageDialog(this,"All fields are required");
            return;
        }

        int ageValue;

        try{
            ageValue = Integer.parseInt(age);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Age must be numeric");
            return;
        }

        if(ageValue < 16 || ageValue > 60){
            JOptionPane.showMessageDialog(this,"Age must be between 16 and 60");
            return;
        }

        if(!phone.matches("\\d{10}")){
            JOptionPane.showMessageDialog(this,"Phone must contain 10 digits");
            return;
        }

        JOptionPane.showMessageDialog(this,"Validation Successful");
    }

    public static void main(String[] args) {
        ValidationForm vf = new ValidationForm();
        vf.setVisible(true);
    }
}