package week17;

import javax.swing.*;
import java.awt.*;

public class LibraryNotice extends JFrame {

    public LibraryNotice() {

        setTitle("Library Notice");
        setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setBounds(50, 50, 300, 150);
        panel.setBackground(Color.LIGHT_GRAY);

        JLabel label = new JLabel("Library Opens at 7:00 AM");
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setBounds(40, 50, 250, 30);

        panel.add(label);
        panel.setLayout(null);
        setLayout(null);
        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        LibraryNotice wd = new LibraryNotice();
        wd.setVisible(true);
    }
}