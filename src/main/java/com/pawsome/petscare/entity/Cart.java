package com.pawsome.petscare.entity;

import java.io.Serializable;
import java.util.Date;

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
    private String cartStatus;

    @Column(name="D_START_DATE")
    private Date checkinDate;

    @Column(name="D_END_DATE")
    private Date checkoutDate;

    @Column(name="N_QUANTITY")
    private Integer quantity;

    @Column(name="N_TOTAL")
    private Double total;

    @Column(name="N_DAYS")
    private Integer days;

    // Getters and setters
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

    public Date getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
}
