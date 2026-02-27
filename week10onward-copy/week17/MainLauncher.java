package week17;

import javax.swing.*;

public class MainLauncher {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                Student s1 = new Student("ST101", "Shishir Mishra", "Programming");
                Student s2 = new Student("ST102", "Aaditya Jha", "Networking");

                IDCardWindow w1 = new IDCardWindow(s1);
                w1.setVisible(true);

                IDCardWindow w2 = new IDCardWindow(s2);
                w2.setVisible(true);
            }
        });
    }
}