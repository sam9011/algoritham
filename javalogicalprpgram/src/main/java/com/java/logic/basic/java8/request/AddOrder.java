package com.java.logic.basic.java8.request;

import java.time.LocalDate;

public class AddOrder {
	
	public static Order addOrder() {
		return new Order((long) 1, "pending", LocalDate.now(), 
				LocalDate.now(), AddProduct.addProduct(), AddCustomer.addCustomer());
	}

}
