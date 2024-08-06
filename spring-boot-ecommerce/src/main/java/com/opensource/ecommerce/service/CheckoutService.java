package com.opensource.ecommerce.service;

import com.opensource.ecommerce.dto.Purchase;
import com.opensource.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

	PurchaseResponse placeOrder(Purchase purchase);
}
