package com.pawsome.petscare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pawsome.petscare.entity.Testinomials;
import com.pawsome.petscare.service.TestinomialsService;

@RestController
@CrossOrigin("*")
@RequestMapping("/testinomials")
public class TestinomialsController {

	@Autowired
	TestinomialsService testinomialsService;  
	
	@GetMapping("/getAllTestinomials")
	public ResponseEntity<List<Testinomials>> getAllTestinomials(){
		return ResponseEntity.ok(testinomialsService.getAllTestinomials());
	}
	
	
}
