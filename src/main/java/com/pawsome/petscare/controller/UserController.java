package com.pawsome.petscare.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pawsome.petscare.entity.User;
import com.pawsome.petscare.entity.UserHashMap;
import com.pawsome.petscare.repo.UserHashMapRepo;
import com.pawsome.petscare.repo.UsersRepo;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UsersRepo userRepo;

	@Autowired
	UserHashMapRepo userHashMapRepo;
	
	
	@PostMapping("/save")
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public User save(@RequestBody User user) {		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyhhmmss");	
		String timeStamp = simpleDateFormat.format(new Date());
		User savedUser = userRepo.saveAndFlush(user);
		UserHashMap userHash = new UserHashMap();
		userHash.setUserId(savedUser.getUserId());
		
		userHash.setHashCode(String.valueOf(savedUser.hashCode()).substring(0, 6)+"_"+savedUser.getUserId()
				+timeStamp);
		userHashMapRepo.save(userHash);
		return savedUser;
	}
	
	@GetMapping("/userById")
	public User getByUserId(@RequestParam Integer userId) throws Exception {
		Optional<User> optUser = userRepo.findById(userId);
		if(optUser.isPresent()) {
			return optUser.get();
		}
		throw new Exception("No User Found");
	}
	
}
