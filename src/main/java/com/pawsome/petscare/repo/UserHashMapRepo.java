package com.pawsome.petscare.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pawsome.petscare.entity.UserHashMap;

@Repository
public interface UserHashMapRepo extends JpaRepository<UserHashMap, Integer> {

	public Optional<UserHashMap> findByUserId(Integer userId);
}
