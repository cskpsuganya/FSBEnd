package com.example.backend.model;

import javax.persistence.*;

@Entity
public class OrderModel {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String orderId;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "email", referencedColumnName = "id", nullable = false)
	private User userId;
	private String ProductName;
	private int quantity;
	private String totalPrice;
	private String status;
	private String Price;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
		
}
