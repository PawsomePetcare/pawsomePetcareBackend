package com.pawsome.petscare.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pawsome.petscare.entity.User;

@Repository
public interface UsersRepo extends JpaRepository<User, Integer> {

	Optional<User> findByNameAndPassword(String userId, String password);
	
	Optional<User> findByEmailIdAndPassword(String emailId, String password);

	@Query("select MAX(e.userId) from User e")
	Integer findLastUserId();

}
