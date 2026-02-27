package week17;

import javax.swing.*;
import java.awt.*;

public class CollegeEvent extends JFrame {

    public CollegeEvent() {

        setTitle("College Event Announcement");
        setSize(400, 300);

        getContentPane().setBackground(new Color(173, 216, 230)); // Light Blue

        JLabel label = new JLabel("Welcome to Orientation Day");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setForeground(Color.RED); 
        label.setBounds(60, 120, 300, 30);

        setLayout(null);
        add(label);

        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        CollegeEvent wd = new CollegeEvent();
        wd.setVisible(true);
    }
}