package com.example.backend.Service;


import com.example.backend.model.CartModel;
import com.example.backend.model.ProductModel;
import com.example.backend.model.User;
import com.example.backend.repository.CartRepo;

import com.example.backend.repository.Product_repo;
import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    
	@Autowired
	private CartRepo cart_repo;
	
	@Autowired
	private Product_repo product_repo;
	
	@Autowired
	private UserRepository user_repo;

	public CartModel addmycart(CartModel model){
		return  cart_repo.save(model);
	}

	public CartModel addToCart(Long id, String  quantity) {
		CartModel cartItem = new CartModel();
		ProductModel product = (ProductModel) product_repo.findById(id).orElse(null);
		cartItem.setPrice(product.getPrice());
		cartItem.setProductName(product.getProductName());

		cartItem.setQuantity(quantity);

		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();
		String Current_User = userDetails.getUsername();

		User users = user_repo.findByEmail(Current_User).orElse(null);
		cartItem.setUserId(users);

		return cart_repo.save(cartItem);
	}
}

//
////	public List<User> showCart(long id){
////
////		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
////				.getPrincipal();
////		String Current_User = userDetails.getUsername();
////		User users = user_repo.findByEmail(Current_User).orElse(null);
//
////		User user = user_repo.getById();
////		cart.setUserId(users);
////		System.out.println(users.getId());
////		System.out.println(cart.getCartItemID());
////		System.out.println(cart.getPrice());
////		System.out.println(cart.getProductName());System.out.println(cart.getQuantity());
//
//
//
////return cart_repo.findByUserId(users.getId());
//
//
//
//
//
//
//
//
////		return  cart_repo.findById(users.getId());
////	public Optional<User> showCart(long id){
////		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
////				.getPrincipal();
////		String Current_User = userDetails.getUsername();
////		User users = user_repo.findByEmail(Current_User).orElse(null);
////
////
////		Optional<User> user = user_repo.findById(users.getId());
////
////		return cart_repo.findById(user);
//	}
//
//
//}
