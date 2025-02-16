package com.pawsome.petscare.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin("*")
@RequestMapping("/users")
public class UserController {

	@Autowired
	UsersRepo userRepo;

	@Autowired
	UserHashMapRepo userHashMapRepo;

	@GetMapping("/validateUser")
	public ResponseEntity<User> validateUser(@RequestParam ("userId") String userId , @RequestParam("password") String password) {
		Optional<User> optUser = userRepo.findByEmailIdAndPassword(userId, password);
		if(optUser.isPresent()) {
			return new ResponseEntity<User>(optUser.get(), HttpStatus.OK);			
		}
		return new ResponseEntity<User>(new User(), HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestParam ("userId") String userId , @RequestParam("password") String password, @RequestParam("name") String name) {
		try {
		Integer lastUserId = userRepo.findLastUserId();
		User user = new User(lastUserId+1, name, userId, password);
		User save = userRepo.save(user);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyhhmmss");
		String timeStamp = simpleDateFormat.format(new Date());
		saveUserHash(timeStamp, save);
		return new ResponseEntity<User>(save, HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<User>(new User(), HttpStatus.BAD_REQUEST);			
		}

	}
	
	
	@PostMapping("/save")
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public User save(@RequestBody User user) {		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyhhmmss");	
		String timeStamp = simpleDateFormat.format(new Date());
		User savedUser = userRepo.saveAndFlush(user);
		saveUserHash(timeStamp, savedUser);
		return savedUser;
	}

	private void saveUserHash(String timeStamp, User savedUser) {
		UserHashMap userHash = new UserHashMap();
		userHash.setUserId(savedUser.getUserId());
		
		userHash.setHashCode(String.valueOf(savedUser.hashCode()).substring(0, 6)+"_"+savedUser.getUserId()
				+timeStamp);
		userHashMapRepo.save(userHash);
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
