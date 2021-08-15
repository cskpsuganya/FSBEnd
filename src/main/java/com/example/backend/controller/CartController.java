package com.example.backend.controller;


import com.example.backend.Service.CartService;
import com.example.backend.model.CartModel;
import com.example.backend.repository.CartRepo;
import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CartController {

	@Autowired
	private UserRepository user_repo;

	@Autowired
	private CartService cartservice;
	
	@Autowired
	private CartRepo cart_repo;

	@PostMapping("/home/{id}")
	public CartModel addToCart(@PathVariable Long id, @RequestBody String quantity) {

		CartModel cartItem = cartservice.addToCart(id, quantity);
		return cartItem;
	}

//	@GetMapping("/cart/{id}")
//	public List<cartresponse> showCart(@PathVariable Long id){
//		return user_repo.getJoinInformation();
//	}



}
