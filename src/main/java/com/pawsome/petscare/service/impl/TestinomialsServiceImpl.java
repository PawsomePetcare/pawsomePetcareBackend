package com.pawsome.petscare.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pawsome.petscare.entity.Testinomials;
import com.pawsome.petscare.repo.TestinomialsRepo;
import com.pawsome.petscare.service.TestinomialsService;

@Service
public class TestinomialsServiceImpl implements TestinomialsService {

	@Autowired
	TestinomialsRepo testinomialsRepo; 
	
	@Override
	public List<Testinomials> getAllTestinomials() {
		return testinomialsRepo.findAll();
	}

}
