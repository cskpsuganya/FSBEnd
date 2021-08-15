package com.example.backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class CartModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cartItemID;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "cart_id", referencedColumnName = "id", nullable = false)
	private User userId;

	private String ProductName;
	private String Quantity;
	private String Price;

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Long getCartItemID() {
		return cartItemID;
	}
	public void setCartItemID(Long cartItemID) {
		this.cartItemID = cartItemID;
	}

	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
}
