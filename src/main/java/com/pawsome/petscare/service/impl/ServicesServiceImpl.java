package com.pawsome.petscare.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pawsome.petscare.entity.ServicesDetails;
import com.pawsome.petscare.repo.ServicesDetailsRepo;
import com.pawsome.petscare.service.ServicesService;

@Service
public class ServicesServiceImpl implements ServicesService{

	@Autowired
	ServicesDetailsRepo servicesDetailsRepo; 
	
	@Override
	public List<ServicesDetails> getAllServiceDetails() {
		
		 return servicesDetailsRepo.findAll();		 
		 
	}

	@Override
	public ServicesDetails getServicesById(Integer id) throws Exception {
		 Optional<ServicesDetails> opt = servicesDetailsRepo.findById(id);
		 if(opt.isPresent()) {
			 return opt.get();
		 }
		 else {
			 throw new Exception("No service found");
		 }
	}

	@Override
	public List<ServicesDetails> getAllServicesDetailsByMultiId(List<Integer> servicesId) {
		return servicesDetailsRepo.findAllById(servicesId);
	}

}
