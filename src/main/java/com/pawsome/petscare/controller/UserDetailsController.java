package com.pawsome.petscare.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pawsome.petscare.entity.UserDetails;
import com.pawsome.petscare.service.UserDetailsService;

@RestController
@RequestMapping("/user-details")
@CrossOrigin("*")
public class UserDetailsController {

    @Autowired
    private UserDetailsService userDetailsService;

    @GetMapping("/{userId}")
    public UserDetails getUserDetails(@PathVariable String userId) {
        return userDetailsService.getUserDetails(userId);
    }

    @PostMapping("/")
    public UserDetails saveUserDetails(@RequestBody UserDetails userDetails) {
        return userDetailsService.saveUserDetails(userDetails);
    }

    @PutMapping("/")
    public UserDetails updateUserDetails(@RequestBody UserDetails userDetails) {
        return userDetailsService.saveUserDetails(userDetails);
    }
}
