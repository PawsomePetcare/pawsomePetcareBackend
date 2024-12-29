package com.pawsome.petscare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pawsome.petscare.entity.ServicesDetails;
import com.pawsome.petscare.repo.ServicesDetailsRepo;
import com.pawsome.petscare.service.ServicesService;

@CrossOrigin("*")
@RestController
@RequestMapping("/services")
public class SericesController {

	@Autowired
	ServicesService servicesService;
	
	@Autowired
	ServicesDetailsRepo servicesDetailsRepo;
	
	@GetMapping("/")
	public String greetServices() {
		return "Welcome";
	}
	
	@GetMapping("/allServiceDetails")
	public  ResponseEntity<List<ServicesDetails>> getAllServiceDetails(){
		 return ResponseEntity.ok(servicesService.getAllServiceDetails());		 
	}

	@PostMapping("/save")
	public ServicesDetails save(@RequestBody ServicesDetails req) {
		return servicesDetailsRepo.save(req);
	}
	
}
