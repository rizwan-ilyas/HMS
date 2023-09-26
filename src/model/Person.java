package model;

public class Person {

    String name;
    String address;
    String phNumber;

    public Person() {
        this.name = "";
        this.address = "";
        this.phNumber = "";
    }
    public Person(String name, String address, String phNumber) {
        this.name = name;
        this.address = address;
        this.phNumber = phNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }


}
