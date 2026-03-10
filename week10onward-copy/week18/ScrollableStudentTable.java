package week18;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ScrollableStudentTable extends JFrame {

    JTable table;
    JButton btn;

    public ScrollableStudentTable() {

        setTitle("Student Records with Scroll");
        setSize(500,350);

        String[] columns = {"ID","Name","Course"};

        Object[][] data = {
                {"101","Shishir Mishra","Programming"},
                {"102","Aaditya Jha","Networking"},
                {"103","Rohit Sharma","AI"},
                {"104","Sita Lama","Cyber Security"},
                {"105","Ramesh Thapa","Data Science"},
                {"106","Anita Rai","Marketing"},
                {"107","Sanjay KC","Finance"},
                {"108","Maya Shrestha","Design"},
                {"109","Ram Singh","Law"},
                {"110","Pooja Adhikari","Media"}
        };

        DefaultTableModel model = new DefaultTableModel(data, columns){
            public boolean isCellEditable(int r,int c){
                return false;
            }
        };

        table = new JTable(model);
        table.setRowHeight(25);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scroll = new JScrollPane(table);
        scroll.setBounds(30,30,420,200);

        btn = new JButton("Show Selected");
        btn.setBounds(180,250,140,30);

        btn.addActionListener(e -> {
            int row = table.getSelectedRow();
            if(row != -1){
                String name = table.getValueAt(row,1).toString();
                JOptionPane.showMessageDialog(this,"Selected: "+name);
            }else{
                JOptionPane.showMessageDialog(this,"Select a row first");
            }
        });

        setLayout(null);
        add(scroll);
        add(btn);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ScrollableStudentTable().setVisible(true);
    }
}