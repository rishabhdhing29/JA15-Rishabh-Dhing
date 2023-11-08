package com.hexaware.springboot2.dao;

import java.util.List;

import com.hexaware.springboot2.entity.Product;

public interface IProductDao {
  
	public boolean createProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(int productId);
	public boolean getProductById(int productId);
	
	public List<Product> getAllProduct();
	
}
