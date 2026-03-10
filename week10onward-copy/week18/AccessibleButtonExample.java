package week18;

import javax.swing.*;

public class AccessibleButtonExample extends JFrame {

    public AccessibleButtonExample() {

        setTitle("Accessibility Example");
        setSize(400,250);

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(150,100,100,30);
        btnSave.setMnemonic('S');
        btnSave.setToolTipText("Click or press Alt+S to save the details");

        setLayout(null);
        add(btnSave);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AccessibleButtonExample().setVisible(true);
    }
}