package controller;

import model.Appointment;

import java.util.Vector;

public class AppointmentController {

    static AppointmentController appointmentController;
Vector<Appointment> appointments;
    public AppointmentController(){
    appointments=new Vector<>();
    }

    public static AppointmentController getInstance(){
        if(appointmentController==null){
            appointmentController=new AppointmentController();
        }
        return appointmentController;
    }

    public void addAppointment(Appointment appointment){
        appointments.add(appointment);
    }

    public Vector<Vector<String>> getAppointments(){
        Vector<Vector<String>> patientsData=new Vector<Vector<String>>();
        for(Appointment p : appointments){
            Vector<String> vec=new Vector<>();
            vec.add(Integer.toString(Integer.valueOf(p.getDoctor_id())));
            vec.add(Integer.toString(p.getPatient_id()));
            vec.add(p.getDate());
            patientsData.add(vec);
        }
        return patientsData;
    }


    public Vector<String> getCoulmns(){
        Vector<String> columns=new Vector<>();
        columns.add("Doctor's ID");
        columns.add("Patient's ID");
        columns.add("Date");
        return columns;
    }


    public void populateDummyAppointments(){
        Appointment p=new Appointment(1,1,"Fever");
        Appointment p1=new Appointment(1,1,"Fever");
        Appointment p2=new Appointment(1,1,"Fever");
        Appointment p3=new Appointment(1,1,"Fever");
        Appointment p4=new Appointment(1,1,"Fever");
        Appointment p5=new Appointment(1,1,"Fever");
        appointments.add(p);
        appointments.add(p1);
        appointments.add(p2);
        appointments.add(p3);
        appointments.add(p4);
        appointments.add(p5);
    }






}
