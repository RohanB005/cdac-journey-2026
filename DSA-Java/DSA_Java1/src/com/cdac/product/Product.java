package com.cdac.product;


class Product{
	int quantity;
	
	Product(int quantity){
		this.quantity = quantity;
	}
	
	void purchase() {
		int qty = 0;
		if(qty > quantity) {
			throw new ArithmeticException("Not enough stock");
		}
		quantity -= qty;
		System.out.println("Purchase successful");
	}
}
