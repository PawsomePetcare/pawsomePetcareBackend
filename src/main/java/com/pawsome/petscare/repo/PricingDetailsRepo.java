package com.pawsome.petscare.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pawsome.petscare.entity.PricingDetails;

@Repository
public interface PricingDetailsRepo extends JpaRepository<PricingDetails, Integer>{

}
