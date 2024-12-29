package com.pawsome.petscare.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pawsome.petscare.entity.ServicesDetails;

@Repository
public interface ServicesDetailsRepo  extends JpaRepository<ServicesDetails, Integer>{
	
}
