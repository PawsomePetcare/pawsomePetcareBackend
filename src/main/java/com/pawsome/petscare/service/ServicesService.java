package com.pawsome.petscare.service;

import java.util.List;

import com.pawsome.petscare.entity.ServicesDetails;

public interface ServicesService {

	public List<ServicesDetails> getAllServiceDetails();
	
	public ServicesDetails getServicesById(Integer id) throws Exception;
	
	public List<ServicesDetails> getAllServicesDetailsByMultiId(List<Integer> servicesId);
}
