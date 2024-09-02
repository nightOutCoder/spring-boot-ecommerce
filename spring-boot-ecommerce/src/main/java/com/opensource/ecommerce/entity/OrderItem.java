package com.opensource.ecommerce.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="order_item")
@Getter
@Setter
public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="image_url")
	private String imageUrl;
	
	@Column(name="unit_price")
	private BigDecimal unitPrice;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="product_id")
	private Long product_Id;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	@JsonIgnore // To avoid recursive reference between Order and OrderItem: https://localhost:8443/api/customers
	/*
	@JsonIgnore annotation, which is used to instruct Jackson to exclude a specific property from the JSON serialization and deserialization processes. This can be particularly useful when you have fields in your class that you don't want to expose through your API or when certain fields are not needed in the JSON output
	*/
	private Order order;
}
