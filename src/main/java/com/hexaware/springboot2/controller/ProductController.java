package com.hexaware.springboot2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.assignment.service.IProductService;
import com.hexaware.hibernatemap.entities.Product;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private IProductService productService; // Inject the ProductService

	@RequestMapping(path = "/openform", method = RequestMethod.GET)
	
	public String openForm() {
		return "add_product";
	}

	@RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String addProduct(@RequestParam int productId , @RequestParam String productName, @RequestParam double productAmount, @RequestParam int productQuantity) {
        Product product = new Product(productId, productName, productAmount, productQuantity);
        
        // Call the service layer to save the product in the database
        productService.addProduct(product);
        
        return "Product added successfully: " + product.toString();
}
}
