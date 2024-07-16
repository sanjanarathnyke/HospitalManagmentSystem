package com.gui;

public class Patient {
    private String patientid;
    private String name;
    private String gender;
    private int age;
    private String phoneNumber;
    private String address;
    private String disease;
    private String comments;
    private String roomType;
    private String roomNumber;
    private String regDate;

    // Constructor
    public Patient(String patientid, String name, String gender, int age, String phoneNumber, String address, String disease, String comments, String roomType, String roomNumber, String regDate) {
        this.patientid = patientid;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.disease = disease;
        this.comments = comments;
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.regDate = regDate; // Initialize regDate in the constructor
    }

    // Getters
    public String getPatientID() {
        return patientid;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getDisease() {
        return disease;
    }

    public String getComments() {
        return comments;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRegDate() {
        return regDate;
    }

    // Setter for registration date
    public void setRegistrationDate(String registrationDate) {
        this.regDate = registrationDate;
    }
}
