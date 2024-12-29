package com.pawsome.petscare.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="SERVICES_DETAILS")
public class ServicesDetails implements Serializable {

	private static final long serialVersionUID = 5223448700772388998L;
	
	public ServicesDetails() {
		super();
	}

	@Id
	@Column(name= "N_SERVICE_ID")
	private Integer serviceid;
	
	@Column(name="V_DESCRIPTION")
	private String description;
	
	@Column(name="V_TITLE")
	private String title;
	
	@Column(name="N_PRICE")
	private Double price;
	
	@Column(name="V_IMAGE_ID")
	private String imageId;

	
	
	public Integer getServiceid() {
		return serviceid;
	}



	public void setServiceid(Integer serviceid) {
		this.serviceid = serviceid;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
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



	@Override
	public String toString() {
		return "ServicesDetails [serviceid=" + serviceid + ", description=" + description + ", title=" + title
				+ ", price=" + price + ", imageId=" + imageId + "]";
	}
	
	
	
	
}
