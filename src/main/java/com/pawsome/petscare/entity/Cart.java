package com.pawsome.petscare.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CART")
public class Cart implements Serializable {

	private static final long serialVersionUID = -8330485346048716908L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cartId;
	
	@Column(name="N_USER_HASH_ID")
	private Integer userHashId;
	
	@Column(name="N_SERVICE_ID")
	private Integer serviceId;
	
	@Column(name="V_STATUS")
	private  String cartStatus;

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Integer getUserHashId() {
		return userHashId;
	}

	public void setUserHashId(Integer userHashId) {
		this.userHashId = userHashId;
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public String getCartStatus() {
		return cartStatus;
	}

	public void setCartStatus(String cartStatus) {
		this.cartStatus = CartStatus.valueOf(cartStatus.toUpperCase()).toString();
	}

	
	
}
