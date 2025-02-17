package com.pawsome.petscare.repo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private LocalDate dob;
    private String medications;
    private String dietaryRequirements;
    private String breed;
    private boolean receivedTickVaccine;
    private boolean receivedRabiesVaccine;
    
    @Column(name = "N_USER_ID")
    private Integer userId;
    
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getMedications() {
		return medications;
	}
	public void setMedications(String medications) {
		this.medications = medications;
	}
	public String getDietaryRequirements() {
		return dietaryRequirements;
	}
	public void setDietaryRequirements(String dietaryRequirements) {
		this.dietaryRequirements = dietaryRequirements;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public boolean isReceivedTickVaccine() {
		return receivedTickVaccine;
	}
	public void setReceivedTickVaccine(boolean receivedTickVaccine) {
		this.receivedTickVaccine = receivedTickVaccine;
	}
	public boolean isReceivedRabiesVaccine() {
		return receivedRabiesVaccine;
	}
	public void setReceivedRabiesVaccine(boolean receivedRabiesVaccine) {
		this.receivedRabiesVaccine = receivedRabiesVaccine;
	}


}
