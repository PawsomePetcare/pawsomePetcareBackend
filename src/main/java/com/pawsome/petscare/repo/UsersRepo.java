package com.pawsome.petscare.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pawsome.petscare.entity.User;

@Repository
public interface UsersRepo extends JpaRepository<User, Integer> {

}
