package com.hexaware.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hexaware.hibernatemap.entities.Product;
@SpringBootApplication
public class Springboot2Application {

	public static void main(String[] args) {
		ApplicationContext context =	SpringApplication.run(Springboot2Application.class, args);
		
		Product  pro =		context.getBean(Product.class);
	
			System.out.println(pro);
	}

}
