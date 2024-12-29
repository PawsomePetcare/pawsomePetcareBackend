package com.pawsome.petscare.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pawsome.petscare.entity.Testinomials;

@Repository
public interface TestinomialsRepo extends JpaRepository<Testinomials, Integer> {

}
