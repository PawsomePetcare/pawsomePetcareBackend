package com.pawsome.petscare.service;

import java.util.List;

import com.pawsome.petscare.entity.PricingDetails;

public interface PricingService {

	public List<PricingDetails> getAllPricingDetails();

	public PricingDetails getAllPricingDetailsById(Integer id) throws Exception;
	
}


