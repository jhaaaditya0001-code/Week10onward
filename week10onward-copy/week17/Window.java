package week17;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window() {

        setTitle("CS4001NI Programming");
        setSize(500, 500);

        JPanel panel = new JPanel();
        panel.setBounds(50, 50 , 400, 400);
        panel.setBackground(Color.RED);
        panel.setBorder(BorderFactory.createTitledBorder("User Details"));
        
        JLabel label= new JLabel("Username");
        label.setFont(new Font("Arial",Font.BOLD, 16));
        label.setBounds(20,20,100,30);
        
        JTextField txtField= new JTextField();
        txtField.setBounds(130,50,100,30);
        
        JButton btn= new JButton("Submit");
        btn.setBounds(50,90,100,30);
        btn.setBackground(Color.RED);
        btn.setBackground(Color.BLUE);
        
        panel.add(btn);
        panel.add(txtField);
        panel.add(label);
        panel.setLayout(null);
        setLayout(null);
        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Window wd = new Window();
        wd.setVisible(true);
    }
}