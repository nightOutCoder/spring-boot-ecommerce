package com.opensource.ecommerce.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.opensource.ecommerce.entity.Customer;

/*@RepositoryRestResource 
If want ot expose : https://localhost:8443/api/customers
*/
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Customer findByEmail(String theEmail);
}
