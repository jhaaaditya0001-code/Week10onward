package week18;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudentTable extends JFrame {

    JTable table;
    JButton btn;

    public StudentTable() {

        setTitle("Student Records");
        setSize(500,300);

        String[] columns = {"ID","Name","Course"};

        Object[][] data = {
                {"101","Shishir Mishra","Programming"},
                {"102","Aaditya Jha","Networking"},
                {"103","Rohit Sharma","AI"}
        };

        DefaultTableModel model = new DefaultTableModel(data, columns){
            public boolean isCellEditable(int r,int c){
                return false;
            }
        };

        table = new JTable(model);
        table.setRowHeight(25);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(50,40,380,150);

        btn = new JButton("Show Selected");
        btn.setBounds(180,210,140,30);

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
        add(sp);
        add(btn);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new StudentTable().setVisible(true);
    }
}