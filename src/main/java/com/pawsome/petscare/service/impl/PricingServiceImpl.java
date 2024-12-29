package com.pawsome.petscare.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pawsome.petscare.entity.PricingDetails;
import com.pawsome.petscare.repo.PricingDetailsRepo;
import com.pawsome.petscare.service.PricingService;

@Service
public class PricingServiceImpl  implements PricingService{

	
	@Autowired
	PricingDetailsRepo pricingDetailsRepo; 
	
	
	@Override
	public List<PricingDetails> getAllPricingDetails() {
		
		return pricingDetailsRepo.findAll();
	}


	@Override
	public PricingDetails getAllPricingDetailsById(Integer id) throws Exception {
		
		Optional<PricingDetails> ent = pricingDetailsRepo.findById(id);
		if(ent.isPresent()) {
			return ent.get();
		}
		throw new Exception("Could not find pricing details wrt privcing id");
	}

	
	
}
