package com.emreshome.Shopping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emreshome.Shopping.Entity.Product;
import com.emreshome.Shopping.repositories.ProductRepository;


//TODO
@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	//TODO
	@Autowired
	private ProductRepository productRepository;
	
	public Product findByCode(String code) {
		return productRepository.findByCode(code);
	}

	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}
