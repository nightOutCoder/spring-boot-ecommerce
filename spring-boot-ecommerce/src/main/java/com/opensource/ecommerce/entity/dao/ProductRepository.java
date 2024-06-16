package com.opensource.ecommerce.entity.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.opensource.ecommerce.entity.Product;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {
	//http://localhost:8080/api/products/search/findByCategoryId?id=2
	Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);
	
	
	//http://localhost:8080/api/products/search/findByNameContaining?name=Python
	Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable);
	
}
