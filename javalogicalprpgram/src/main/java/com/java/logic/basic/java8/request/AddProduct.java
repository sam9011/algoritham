package com.java.logic.basic.java8.request;

import java.util.ArrayList;
import java.util.List;

public class AddProduct {

	public static List<Product> addProduct() {
		List<Product> list = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			list.add(new Product((long) i, "Prod-"+i, "tech-"+i, (double) (1000*i)));
		}
		return list;
	}
}
