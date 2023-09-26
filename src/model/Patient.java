package model;

public class Patient extends Person{
    int id;
    String disease;

    public Patient(int id,String disease){
        this.id=id;
        this.disease=disease;
    }

    public Patient(int id,String name, String address, String phNumber,String disease){
        super(name,address,phNumber);
        this.id=id;
        this.disease=disease;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
