package com.pawsome.petscare.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="USERS")
public class User  implements Serializable{

	private static final long serialVersionUID = 8824194203005708346L;

	
	
	public User() {
		super();
	}


	@Id
	@Column(name="N_USER_ID")
	private Integer userId;	
	
	@Column(name="V_NAME")
	private String name;
	
	@Column(name="V_EMAIL_ID")
	private String emailId;
	
	@Column(name="V_PASSWORD")
	private String password;
	
	public Integer getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}	
	
	
}
