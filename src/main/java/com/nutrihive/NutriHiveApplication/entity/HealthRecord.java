package com.nutrihive.NutriHiveApplication.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "health_records")
public class HealthRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private int age;
    private String gender;
    private String healthCondition;
//    private Double bloodSugar;
    private Double weight;
    private Double height;
    private Double bmi;
    private String userEmail;

    // Constructors
    public HealthRecord() {}

    public HealthRecord(String name, int age, String gender, String healthCondition, Double bloodSugar, Double weight, Double height, Double bmi, String userEmail) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.healthCondition = healthCondition;
//        this.bloodSugar = bloodSugar;
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
        this.userEmail = userEmail;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getHealthCondition() { return healthCondition; }
    public void setHealthCondition(String healthCondition) { this.healthCondition = healthCondition; }

//    public Double getBloodSugar() { return bloodSugar; }
//    public void setBloodSugar(Double bloodSugar) { this.bloodSugar = bloodSugar; }

    public Double getWeight() { return weight; }
    public void setWeight(Double weight) { this.weight = weight; }

    public Double getHeight() { return height; }
    public void setHeight(Double height) { this.height = height; }

    public Double getBmi() { return bmi; }
    public void setBmi(Double bmi) { this.bmi = bmi; }

    public String getUserEmail() { return userEmail; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }
}


