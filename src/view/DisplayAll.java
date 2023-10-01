package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

public class DisplayAll {

    JFrame frame;
    JPanel panel;
    String title;
    JLabel lblTitle;
    JTable table;
    Vector<String> coulmnNames;
    Vector<Vector<String>> data;

    DefaultTableModel tableModel;

    public DisplayAll(String title, Vector<String> columns, Vector<Vector<String>> d){
        this.title=title;
        this.coulmnNames=columns;
        data=d;
        tableModel=new DefaultTableModel(data, coulmnNames);
        initGUI();
    }

    void initGUI(){
        frame=new JFrame("Hospital Management System");
        frame.setLayout(new BorderLayout());

        panel=new JPanel();

        lblTitle=new JLabel(title);

        table =new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        panel.add(lblTitle,BorderLayout.NORTH);
        panel.add(scrollPane,BorderLayout.CENTER);

        frame.add(panel);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
    }

    public void display(){
        frame.setVisible(true);
    }






}
