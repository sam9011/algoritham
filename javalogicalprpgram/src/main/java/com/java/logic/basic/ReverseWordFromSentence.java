package com.java.logic.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWordFromSentence {
	
	public static void main(String[] args) {
		
		String str = "Hello Siddheshwar! Welcome to Office";
		
	List<Employee> l = new ArrayList<Employee>();
	String dep = "IT-";
	Double sal = 1000.00;
	String name = "Sam-";
	
	for(int i=1;i<=10;i++) {
		l.add( new Employee(i, name+""+i, (double) (sal*i), dep+" "+i));
	}
	
	List<Employee> empMaxSal = l.stream().sorted().collect(Collectors.toList());
	
	empMaxSal.stream().forEach(System.out::println);
//			Stream.of(str.split(" ")).re
//	Collections.reverse(l);
//	String s =l.stream().reduce(" ",(a,b)->a+" "+b).strip();
	
	System.out.println(l.get(1).toString());
	
		
	}

}
