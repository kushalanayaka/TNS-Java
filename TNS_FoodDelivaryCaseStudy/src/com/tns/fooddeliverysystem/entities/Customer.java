package com.tns.fooddeliverysystem.entities;

public class Customer extends User{
     private Cart cart;


	public Customer(int userId, String username, long contactNo) {
		super(userId, username, contactNo);
		this.cart = cart;
	}

	public Cart getCart() {
		return cart;
	}

     
     
}
