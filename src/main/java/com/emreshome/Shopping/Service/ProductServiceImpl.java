package com.emreshome.Shopping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emreshome.Shopping.Entity.Product;
import com.emreshome.Shopping.dao.ProductRepository;


//TODO
//@Service
public class ProductServiceImpl implements ProductService{
	//TODO
	//@Autowired
	private ProductRepository productRepository;
	
	public Product findByCode(String code) {
		return productRepository.findByCode(code);
	}

	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}
