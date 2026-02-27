package week17;

import javax.swing.*;
import java.awt.*;

public class StudentProfileViewer extends JFrame {

    public StudentProfileViewer() {

        setTitle("Student Profile");
        setSize(400, 300);

        JLabel label = new JLabel("Student Information");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setBounds(100, 120, 250, 30);

        setLayout(null);
        add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                StudentProfileViewer sw = new StudentProfileViewer
             ();
                sw.setVisible(true);
            }
        });

    }
}