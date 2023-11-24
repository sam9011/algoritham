package com.java.logic.basic.java8.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {

	private Long id;
	private String name;
	private Integer tier;
}
