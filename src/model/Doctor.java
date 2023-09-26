package model;

public class Doctor extends Person {
    int id;
    String specialization;
    int experience;
    double fee;

    public Doctor(int id,String specialization,int experience,double fee){
        this.id=id;
        this.specialization=specialization;
        this.experience=experience;
        this.fee=fee;
    }

    public Doctor(String name, String address, String phNumber,int id,String specialization,int experience,double fee){
        super(name,address,phNumber);
        this.id=id;
        this.specialization=specialization;
        this.experience=experience;
        this.fee=fee;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
