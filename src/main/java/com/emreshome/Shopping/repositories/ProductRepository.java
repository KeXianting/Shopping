package com.emreshome.Shopping.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emreshome.Shopping.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
	Product findByCode(String code);
	List<Product> findAll();
}
