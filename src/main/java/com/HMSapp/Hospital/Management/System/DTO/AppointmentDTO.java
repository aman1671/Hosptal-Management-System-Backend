package com.HMSapp.Hospital.Management.System.DTO;


public class AppointmentDTO {

    private Long id;
    private String name;
    private int age;
    private String symptoms;
    private String number;

   
    public AppointmentDTO() {}

    public AppointmentDTO(Long id, String name, int age, String symptoms, String number) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.symptoms = symptoms;
        this.number = number;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
