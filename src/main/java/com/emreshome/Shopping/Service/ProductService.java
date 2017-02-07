package com.emreshome.Shopping.Service;

import java.util.List;

import com.emreshome.Shopping.Entity.Product;

public interface ProductService {

		Product findByCode(String code);
		List<Product> findAll();
}
