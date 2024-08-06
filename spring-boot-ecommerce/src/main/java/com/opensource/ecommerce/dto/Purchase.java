package com.opensource.ecommerce.dto;

import java.util.Set;

import com.opensource.ecommerce.entity.Address;
import com.opensource.ecommerce.entity.Customer;
import com.opensource.ecommerce.entity.Order;
import com.opensource.ecommerce.entity.OrderItem;

import lombok.Data;

@Data
public class Purchase {

	private Customer customer;
	private Address shippingAddress;
	private Address billingAddress;
	private Order order;
	private Set<OrderItem> orderItems;
}
