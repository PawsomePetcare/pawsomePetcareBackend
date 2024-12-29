package com.pawsome.petscare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pawsome.petscare.entity.PricingDetails;
import com.pawsome.petscare.service.PricingService;

@RestController
@RequestMapping("/pricing")
public class PricingController {

	
	@Autowired
	PricingService pricingService;
	
	@GetMapping("/allDetails")
	public ResponseEntity<List<PricingDetails>> getAllPricingDetails(){
		return ResponseEntity.ok(pricingService.getAllPricingDetails());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PricingDetails> getAllPricingDetailsById(@PathVariable Integer id) throws Exception{
		try {
		 return ResponseEntity.ok(pricingService.getAllPricingDetailsById(id));
		}catch(Exception e) {
			throw e;
		}
	}
	
}
