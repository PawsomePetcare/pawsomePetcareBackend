package com.pawsome.petscare.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PricingDetails implements Serializable {
	
	private static final long serialVersionUID = -4270436282246277664L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="N_PRICING_ID")
	private Integer pricingId;
	

	@Column(name  = "V_TITLE")
	private String title;
	
	@Column(name= "V_DESCRIPTION")
	private String description;
	
	
	@Column(name="N_PRICE")
	private Double price;

	
}
