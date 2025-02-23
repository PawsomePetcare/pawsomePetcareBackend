package com.pawsome.petscare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pawsome.petscare.entity.UserDetails;

public interface UserDetailsRepo extends JpaRepository<UserDetails, Long> {
    UserDetails findByUserId(String userId);
}
