package com.emreshome.Shopping.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emreshome.Shopping.Entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
	Product findByCode(String code);
	List<Product> findAll();
}
