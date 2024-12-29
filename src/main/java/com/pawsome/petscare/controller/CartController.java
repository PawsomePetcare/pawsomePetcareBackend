package com.pawsome.petscare.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pawsome.petscare.dto.CartDto;
import com.pawsome.petscare.dto.ServicesDto;
import com.pawsome.petscare.entity.Cart;
import com.pawsome.petscare.entity.CartStatus;
import com.pawsome.petscare.entity.ServicesDetails;
import com.pawsome.petscare.entity.UserHashMap;
import com.pawsome.petscare.repo.CartRepo;
import com.pawsome.petscare.repo.UserHashMapRepo;
import com.pawsome.petscare.service.ServicesService;

@RestController
@RequestMapping("/cart")
@CrossOrigin("*")
public class CartController {

	@Autowired
	CartRepo cartRepo;
	
	@Autowired
	UserHashMapRepo userHashMapRepo;
	
	@Autowired
	ServicesService servicesService;

	@GetMapping("/checkoutServices")
	@Transactional
	public List<ServicesDto> checkoutServices(@RequestParam Integer userId) throws Exception {
		Optional<UserHashMap> userhash = userHashMapRepo.findByUserId(userId);
		if(userhash.isPresent()) {
			List<Cart> carts = cartRepo.findByCartStatusAndUserHashId(CartStatus.ADDED.toString(), userhash.get().getHashMapId());
			ArrayList<Cart> cartsUpdated = new ArrayList<Cart>();
			
			carts.forEach((i) -> {
				i.setCartStatus(CartStatus.COMPLETED.toString());
				cartsUpdated.add(i);
			});
			
			cartRepo.saveAll(cartsUpdated);
			return new ArrayList<ServicesDto>();
		}
		return getAllByStatus(userId, CartStatus.ADDED.toString());
	}
	
	
	@GetMapping("/completedServices")
	@Transactional
	public List<ServicesDto> completedServices(@RequestParam Integer userId) throws Exception {
		Optional<UserHashMap> userhash = userHashMapRepo.findByUserId(userId);
		if(userhash.isPresent()) {
			List<Cart> carts = cartRepo.findByCartStatusAndUserHashId(CartStatus.COMPLETED.toString(), userhash.get().getHashMapId());
			ArrayList<Cart> cartsUpdated = new ArrayList<Cart>();
			
			carts.forEach((i) -> {
				i.setCartStatus(CartStatus.BOOKED.toString());
				cartsUpdated.add(i);
			});
			
			cartRepo.saveAll(cartsUpdated);
			return new ArrayList<ServicesDto>();
		}
		return getAllByStatus(userId, CartStatus.COMPLETED.toString());
	}
	
	@DeleteMapping("/removeFromCart")
	public List<ServicesDto> removeFromCart(@RequestParam Integer serviceId, @RequestParam Integer userId) throws Exception {
		Optional<UserHashMap> userhash = userHashMapRepo.findByUserId(userId);
		if(userhash.isPresent()) {
			Cart cart = cartRepo.findByUserHashIdAndServiceId(userhash.get().getHashMapId() , serviceId);
			cart.setCartStatus(CartStatus.REMOVED.toString());
			cartRepo.save(cart);
			return getAllByStatus(userId, CartStatus.ADDED.toString());
		}
		return getAllByStatus(userId, CartStatus.ADDED.toString());
	}
	
	@GetMapping("/getServicesByUserStatus")
	public List<ServicesDto> getAllByStatus(@RequestParam Integer userId , @RequestParam String status) throws Exception{	
		
		Optional<UserHashMap> userhash = userHashMapRepo.findByUserId(userId);
		if(userhash.isPresent()) {
		List<Cart> carts = cartRepo.findByCartStatusAndUserHashId(CartStatus.valueOf(status.toUpperCase()).toString(), userhash.get().getHashMapId());
		ArrayList<ServicesDto> list = new ArrayList<ServicesDto>();
			if(!carts.isEmpty()) {
				List<Integer> servicesId = carts.stream().map(Cart::getServiceId).collect(Collectors.toList());
				List<ServicesDetails> details = servicesService.getAllServicesDetailsByMultiId(servicesId);
				if(!details.isEmpty()) {
				details.forEach((i) -> {
					list.add(new ServicesDto(i.getServiceid(),i.getDescription(), i.getTitle(),i.getPrice(), CartStatus.valueOf(status.toUpperCase()).toString(), i.getImageId(), userId));
				});
				}
			}
			return list;
		}
		throw new Exception("No User Found");
	}
	
	@PostMapping("/save")
	public Cart saveCart(@RequestBody CartDto cartDto) throws Exception {
		
		Optional<UserHashMap> userhash = userHashMapRepo.findByUserId(cartDto.getUserId());
		if(userhash.isPresent()) {
		Cart cart = new Cart();
		cart.setCartStatus(cartDto.getStatus());
		cart.setUserHashId(userhash.get().getHashMapId());
		cart.setServiceId(cartDto.getServiceId());
		Cart save = cartRepo.save(cart);
		return save;
		}else {
			throw new Exception("No User Found");
		}
	}
	
}
