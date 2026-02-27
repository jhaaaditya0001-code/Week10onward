package week17;

import javax.swing.*;
import java.awt.*;

public class IDCardPreview extends JFrame {

    public IDCardPreview() {

        setTitle("ID Card Preview");
        setSize(400, 300);

        JLabel label = new JLabel(
                "<html><center>"+ 
                "<h2>Name: Shishir Mishra</h2>" +
                "Module: Programming<br>" +
                "College: Islington College" +
                "</center></html>"
        );

        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBounds(50, 50, 300, 180);

        setLayout(null);
        add(label);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        IDCardPreview id = new IDCardPreview();
        id.setVisible(true);
    }
} 