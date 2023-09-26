package view;


import controller.AppointmentController;
import controller.DoctorController;
import controller.PatientController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen {

    private JFrame frame;
    private DoctorController doctorController;
    private PatientController patientController;
    private AppointmentController appointmentController;

    public MainScreen(DoctorController refgDoctor, PatientController refgPatient, AppointmentController refgAppointment) {
        doctorController=refgDoctor;
        patientController=refgPatient;
        appointmentController=refgAppointment;
        initGUI();


    }

    private void initGUI() {

        frame = new JFrame("Hospital Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel mainPanel = new JPanel(new BorderLayout());

        // Title Label
        JLabel titleLabel = new JLabel("Hospital Management System");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

        // Buttons Panel
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        JButton addPatientButton = new JButton("Add Patient");
        JButton addDoctorButton = new JButton("Add Doctor");
        JButton addAppointmentButton = new JButton("Add Appointment");

        // Add action listeners to the buttons
        addPatientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAddPatientScreen();
            }
        });

        addDoctorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAddDoctorScreen();
            }
        });

        addAppointmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAddAppointmentScreen();
            }
        });

        buttonsPanel.add(addPatientButton);
        buttonsPanel.add(addDoctorButton);
        buttonsPanel.add(addAppointmentButton);

        // Add components to the main panel
        mainPanel.add(titleLabel, BorderLayout.NORTH);
        mainPanel.add(buttonsPanel, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.setVisible(true);


    }

    private void openAddPatientScreen() {
        JFrame addPatientFrame = new JFrame("Add Patient");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JTextField txtname = new JTextField(15);
        JTextField txtaddress = new JTextField(15);
        JTextField txtphNumber = new JTextField(15);

        JTextField txtid = new JTextField(15);
        JTextField txtdisease= new JTextField(15);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Enter Patient's ID "), gbc);

        gbc.gridx = 1;
        panel.add(txtid, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Enter Name "), gbc);

        gbc.gridx = 1;
        panel.add(txtname, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Enter Address "), gbc);

        gbc.gridx = 1;
        panel.add(txtaddress, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Enter Disease "), gbc);

        gbc.gridx = 1;
        panel.add(txtdisease, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        panel.add(new JButton("Add"), gbc);

        addPatientFrame.add(panel);


        // Add your code to design and display the "Add Patient" screen here
        addPatientFrame.setSize(500, 600);
        addPatientFrame.setVisible(true);
    }

    private void openAddDoctorScreen() {
        JFrame addDoctorFrame = new JFrame("Add Doctor");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JTextField txtname = new JTextField(15);
        JTextField txtaddress = new JTextField(15);
        JTextField txtphNumber = new JTextField(15);

        JTextField txtid = new JTextField(15);
        JTextField txtexperience = new JTextField(15);
        JTextField txtspecialization = new JTextField(15);
        JTextField txtfee = new JTextField(15);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Enter Doctor's ID "), gbc);

        gbc.gridx = 1;
        panel.add(txtid, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Enter Name "), gbc);

        gbc.gridx = 1;
        panel.add(txtname, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Enter Address "), gbc);

        gbc.gridx = 1;
        panel.add(txtaddress, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Enter Doctor's Specialization "), gbc);

        gbc.gridx = 1;
        panel.add(txtspecialization, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(new JLabel("Enter Doctor's Experience "), gbc);

        gbc.gridx = 1;
        panel.add(txtexperience, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(new JLabel("Enter Doctor's Fee "), gbc);

        gbc.gridx = 1;
        panel.add(txtfee, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(new JLabel("Enter Doctor's Phone # "), gbc);

        gbc.gridx = 1;
        panel.add(txtphNumber, gbc);

        gbc.gridx = 1;
        gbc.gridy = 7;
        panel.add(new JButton("Add"), gbc);

        addDoctorFrame.add(panel);

        // Add your code to design and display the "Add Doctor" screen here
        addDoctorFrame.setSize(500, 600);
        addDoctorFrame.setVisible(true);
    }

    private void openAddAppointmentScreen() {
        JFrame addAppointmentFrame = new JFrame("Make Appointment");

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JTextField txtPatientsId = new JTextField(15);
        JTextField txtDoctorId = new JTextField(15);
        JLabel lblFee=new JLabel("0");
        JLabel lblName=new JLabel(" ");

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Enter Doctor's ID "), gbc);

        gbc.gridx = 1;
        panel.add(txtDoctorId, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Enter Patient ID "), gbc);

        gbc.gridx = 1;
        panel.add(txtPatientsId, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Patient Name : "), gbc);

        gbc.gridx = 1;
        panel.add(lblName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(new JLabel("Doctor's fee : "), gbc);

        gbc.gridx = 1;
        panel.add(lblFee, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        panel.add(new JButton("Add"), gbc);

        addAppointmentFrame.add(panel);

        // Add your code to design and display the "Add Appointment" screen here
        addAppointmentFrame.setSize(500, 600);
        addAppointmentFrame.setVisible(true);
    }

}



