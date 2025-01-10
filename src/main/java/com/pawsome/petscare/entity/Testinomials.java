package com.pawsome.petscare.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TESTINOMIALS")
public class Testinomials  implements Serializable{


	private static final long serialVersionUID = -7469065329194301984L;

	
	@Id
	@Column(name="N_TESTINOMIALS_ID")
	private Integer testinomialsId;	
	
	@Column(name="V_NAME")
	private String name;
	
	@Column(name="V_EXPERIENCE")
	private String experience;
	
	@Column(name="V_IMAGE_ID")
	private String imageId;

	public Integer getTestinomialsId() {
		return testinomialsId;
	}

	public void setTestinomialsId(Integer testinomialsId) {
		this.testinomialsId = testinomialsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
