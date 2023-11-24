package com.java.logic.basic.java8.request;

public class AddCustomer {
	
	public static Customer addCustomer() {
		return new Customer((long) 1, "Sam", 2);
	}

}
