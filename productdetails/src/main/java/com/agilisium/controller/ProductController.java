package com.agilisium.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agilisium.data.ConfigDetails;
import com.agilisium.data.Product;

@RestController
@RequestMapping(path = "product/api")
public class ProductController {
	@Value("${server.port}")
	private int portNo;
	@Value("${spring.application.name}")
	private String appName;
	
	@GetMapping(path = "/getproductdetails" , produces = "application/json")
	public ResponseEntity<Product> getProductDetails(){
		Product product = new Product();
		product.setProductId(100);
		product.setProductName("SOAP");
		product.setProductPrice(20.05);
		
		return new ResponseEntity<Product>(product, HttpStatus.OK);
		
	}
	@GetMapping(path = "/getconfigdetails" , produces = "application/json")
	public ResponseEntity<ConfigDetails> getConfigDetails(){
		ConfigDetails configDetails = new ConfigDetails();
		configDetails.setAppName(appName);
		configDetails.setPortNo(portNo);
		
		return new ResponseEntity<ConfigDetails>(configDetails,HttpStatus.OK);
		
	}

}
