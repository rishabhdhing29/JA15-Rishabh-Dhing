package com.hexaware.springboot2.entity;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	private int productId;
	private String productName;
	private double productAmount;
	private int productQuantity;
	
	
	
	public Product() {
		super();
	}



	public Product(int productId, String productName, double productAmount, int productQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productAmount = productAmount;
		this.productQuantity = productQuantity;
	}



	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public double getProductAmount() {
		return productAmount;
	}



	public void setProductAmount(double productAmount) {
		this.productAmount = productAmount;
	}



	public int getProductQuantity() {
		return productQuantity;
	}



	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	

}
