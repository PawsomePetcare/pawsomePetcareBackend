package com.pawsome.petscare.repo;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {

	Optional<Pet> findByIdAndUserId(Long id, Long userId);

	void deleteByIdAndUserId(Long id, Long userId);

	List<Pet> findAllByUserId(Long userId);
}
