package com.pawsome.petscare.dto;

public class CartDto {

private Integer userId;

private Integer serviceId;

private String status;

public Integer getUserId() {
	return userId;
}

public void setUserId(Integer userId) {
	this.userId = userId;
}

public Integer getServiceId() {
	return serviceId;
}

public void setServiceId(Integer serviceId) {
	this.serviceId = serviceId;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}
	
}
