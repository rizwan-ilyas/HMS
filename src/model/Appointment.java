package model;

import java.util.Date;

public class Appointment {

    int doctor_id;
    int patient_id;
    Date date;

    public Appointment(int doctor_id,int patient_id, Date date){
        this.doctor_id=doctor_id;
        this.patient_id=patient_id;
        this.date=date;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
