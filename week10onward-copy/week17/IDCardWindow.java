package week17;

import javax.swing.*;
import java.awt.*;

public class IDCardWindow extends JFrame {

    public IDCardWindow(Student student) {

        setTitle("Student ID Card Preview");
        setSize(450, 300);

        JLabel label = new JLabel(student.getFormattedDetails());
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBounds(50, 40, 350, 200);

        setLayout(null);
        add(label);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}