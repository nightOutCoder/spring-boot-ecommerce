package com.opensource.ecommerce.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.opensource.ecommerce.entity.ProductCategory;

@RepositoryRestResource(collectionResourceRel= "productCategory", path="product_category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{
}
