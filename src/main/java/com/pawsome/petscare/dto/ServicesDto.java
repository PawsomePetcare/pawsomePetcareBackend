package com.pawsome.petscare.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class ServicesDto {

	
	
	public ServicesDto() {
		super();
	}

	public ServicesDto(Integer serviceId, String description, String title, Double price, String status, String imageId, Integer userId) {
		super();
		this.serviceId = serviceId;
		this.description = description;
		this.title = title;
		this.price = price;
		this.status = status;
		this.imageId = imageId;
		this.userId = userId;
	}

	private Integer serviceId;
	
	private String description;

	private String title;
	
	private Double price;
	
	private String status;

	private String imageId;
	
	private Integer userId;

	private Integer quantity;
	
    private Date checkoutDate;
	
	private Date checkinDate;
	
    private Double total;
    
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public Date getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
