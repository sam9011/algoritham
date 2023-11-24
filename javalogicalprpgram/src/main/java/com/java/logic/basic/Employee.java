package com.java.logic.basic;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;


@ToString
@Builder
@Data
public class Employee {
	
	private Integer id;
	private String name;
	private Double sal;
	private String dep;

}
