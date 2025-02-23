package com.pawsome.petscare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pawsome.petscare.entity.UserDetails;
import com.pawsome.petscare.repo.UserDetailsRepo;

@Service
public class UserDetailsService {

    @Autowired
    private UserDetailsRepo userDetailsRepo;

    public UserDetails getUserDetails(String userId) {
        return userDetailsRepo.findByUserId(userId);
    }

    public UserDetails saveUserDetails(UserDetails userDetails) {
        return userDetailsRepo.save(userDetails);
    }
}
