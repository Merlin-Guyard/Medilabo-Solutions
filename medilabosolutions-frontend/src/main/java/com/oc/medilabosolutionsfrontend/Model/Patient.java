package com.oc.medilabosolutionsfrontend.Model;

public class Patient {

    private int id;

    private String firstName;

    private String lastName;

    private String birthdate;

    private String gender;

    private String postalAddress;

    private String phoneNumber;

    public Patient() {
    }

    public Patient(String firstName, String lastName, String birthdate, String gender, String postalAddress, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.gender = gender;
        this.postalAddress = postalAddress;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}