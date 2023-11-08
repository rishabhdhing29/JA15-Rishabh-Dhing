package com.hexaware.springboot2.dao;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.springboot2.entity.Product;


public class ProductDaoImp implements IProductDao {

	private List<Product> productList;
    private int nextProductId = 1;

    public void ProductDaoImpl() {
        productList = new ArrayList<>();
    }

    @Override
    public boolean createProduct(Product product) {
        if (product != null) {
            int productId = nextProductId++;
            product.setProductId(productId);
            productList.add(product);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateProduct(Product product) {
        if (product != null) {
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getProductId() == product.getProductId()) {
                    productList.set(i, product);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean deleteProduct(int productId) {
        for (Product product : productList) {
            if (product.getProductId() == productId) {
                productList.remove(product);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean getProductById(int productId) {
        for (Product product : productList) {
            if (product.getProductId() == productId) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Product> getAllProduct() {
        return new ArrayList<>(productList);
    }
	
	

}
