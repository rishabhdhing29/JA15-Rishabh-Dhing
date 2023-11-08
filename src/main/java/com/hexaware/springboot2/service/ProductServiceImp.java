package com.hexaware.springboot2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexaware.springboot2.dao.IProductDao;
import com.hexaware.springboot2.entity.Product;

public class ProductServiceImp implements IProductService {

	@Autowired
	IProductDao dao;
	
	@Override
	public boolean createProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.createProduct(product);
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.updateProduct(product);
	}

	@Override
	public boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return dao.deleteProduct(productId);
	}

	@Override
	public boolean getProductById(int productId) {
		// TODO Auto-generated method stub
		return dao.getProductById(productId);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return dao.getAllProduct();
	}

}
