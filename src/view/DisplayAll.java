package view;

import controller.UpdateInterface;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
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

    UpdateInterface refgController;

    public DisplayAll(String title, Vector<String> columns, Vector<Vector<String>> d,UpdateInterface refgController){
        this.title=title;
        this.coulmnNames=columns;
        data=d;
        tableModel=new DefaultTableModel(data, coulmnNames);
        this.refgController=refgController;
        initGUI();
    }

    void initGUI(){
        frame=new JFrame("Hospital Management System");
        frame.setLayout(new BorderLayout());

        panel=new JPanel();

        lblTitle=new JLabel(title);

        table =new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        tableModel.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if(e.getType()==TableModelEvent.UPDATE){
                    int row=e.getFirstRow();
                    int col=e.getColumn();
                    System.out.println(String.valueOf(row)+":"+String.valueOf(col));
                    String updatedValue= (String) table.getValueAt(row,col);
                    refgController.update(row,col,updatedValue);
                }
                if(e.getType()==TableModelEvent.DELETE){
                    System.out.println("Deleted");
                }
            }
        });

        JButton btnDelete=new JButton("Delete Row");

        panel.add(lblTitle,BorderLayout.NORTH);
        panel.add(btnDelete,BorderLayout.LINE_END);
        panel.add(scrollPane,BorderLayout.CENTER);

        frame.add(panel);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
    }



    public void display(){
        frame.setVisible(true);
    }






}
