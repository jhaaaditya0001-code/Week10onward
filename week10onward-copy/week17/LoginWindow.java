package week17;

import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JFrame {

    public LoginWindow() {

        setTitle("Login Window");
        setSize(400, 300);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(80, 100, 100, 30);

        JTextField txtUsername = new JTextField();
        txtUsername.setBounds(160, 100, 120, 30);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(150, 150, 100, 30);
        btnLogin.setBackground(Color.GREEN);
        btnLogin.setForeground(Color.WHITE);

        setLayout(null);
        add(userLabel);
        add(txtUsername);
        add(btnLogin);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        LoginWindow lw = new LoginWindow();
        lw.setVisible(true);
    }
}