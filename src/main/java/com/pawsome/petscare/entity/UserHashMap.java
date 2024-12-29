package com.pawsome.petscare.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="USER_HASH_MAP")
public class UserHashMap implements Serializable {

	private static final long serialVersionUID = -7468134044487252073L;


	public UserHashMap() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="N_HASH_MAP_ID")
    private Integer hashMapId;

    @Column(name = "N_USER_ID")
    private Integer userId;

    @Column(name="V_USER_HASH_CODE")
    private String hashCode;
    
   
	public String getHashCode() {
		return hashCode;
	}

	public void setHashCode(String hashCode) {
		this.hashCode = hashCode;
	}

	public Integer getHashMapId() {
		return hashMapId;
	}

	public void setHashMapId(Integer hashMapId) {
		this.hashMapId = hashMapId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}


    
    
}
