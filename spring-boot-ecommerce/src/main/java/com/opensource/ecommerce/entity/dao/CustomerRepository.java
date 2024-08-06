package com.opensource.ecommerce.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opensource.ecommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
