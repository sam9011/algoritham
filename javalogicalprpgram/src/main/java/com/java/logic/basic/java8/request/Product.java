package com.java.logic.basic.java8.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

	private Long id;
	private String name;
	private String categary;
	private Double price;
}
