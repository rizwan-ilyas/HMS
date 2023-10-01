import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create an instance of HospitalSystemScreen to start the application
                new HospitalSystemScreen();
            }
        });
    }
}

class HospitalSystemScreen {
    private JFrame frame;

    public HospitalSystemScreen() {
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
                // When "Add Patient" button is clicked, open the Add Patient screen
                openAddPatientScreen();
            }
        });

        addDoctorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When "Add Doctor" button is clicked, open the Add Doctor screen
                openAddDoctorScreen();
            }
        });

        addAppointmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When "Add Appointment" button is clicked, open the Add Appointment screen
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
        // Add your code to design and display the "Add Patient" screen here
        addPatientFrame.setSize(400, 200);
        addPatientFrame.setVisible(true);
    }

    private void openAddDoctorScreen() {
        JFrame addDoctorFrame = new JFrame("Add Doctor");
        // Add your code to design and display the "Add Doctor" screen here
        addDoctorFrame.setSize(400, 200);
        addDoctorFrame.setVisible(true);
    }

    private void openAddAppointmentScreen() {
        JFrame addAppointmentFrame = new JFrame("Add Appointment");
        // Add your code to design and display the "Add Appointment" screen here
        addAppointmentFrame.setSize(400, 200);
        addAppointmentFrame.setVisible(true);
    }
}
