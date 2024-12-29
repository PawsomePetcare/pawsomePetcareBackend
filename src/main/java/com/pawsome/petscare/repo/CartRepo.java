package com.pawsome.petscare.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pawsome.petscare.entity.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer>{


	List<Cart> findByCartStatusAndUserHashId(String string, Integer userId);

	Cart findByUserHashIdAndServiceId(Integer hashMapId, Integer serviceId);

}
