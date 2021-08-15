package com.example.backend.Service;//package com.example.backend.Service;
//
//import com.example.backend.Model.CartModel;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.example.backend.Model.UserModel;
//import com.example.backend.repository.UserRepo;
//
//import java.util.UUID;
//
//@Service
//public class SignUpService{
//
//	@Autowired
//	private UserRepo user_repo;
//
//
//
//	public UserModel saveUser(UserModel user) {
//		UserModel user1 = new UserModel();
//		user1.setEmail(user.getEmail());
//		user1.setActive(user.isActive());
//		user1.setMobileNumber(user.getMobileNumber());
//		user1.setPassword(user.getPassword());
//		user1.setRole(user.getRole());
//		user1.setUsername(user.getUsername());
//		CartModel cart = new CartModel();
//
//		user1.setCart(cart);
//		return user_repo.save(user1);
//	}
//
////	@Override
////	public UserDetails loadUserByemail(String email)
////		throws UsernameNotFoundException {
////		UserModel user = user_repo.getUserByUsername(email);
////		if(user == null){
////			throw new UsernameNotFoundException("Could not find user");
////		}
////		return  new Authdetails(user);
////	}
//
////	@Override
////	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////		UserModel user = user_repo.getUserByUsername(username);
////		if(user == null){
////			throw new UsernameNotFoundException("Could not find user");
////		}
////		return  new Authdetails(user);
////	}
//
////	@Override
////	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////		return null;
////	}
//}
