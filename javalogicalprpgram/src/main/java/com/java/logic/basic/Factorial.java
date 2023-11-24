package com.java.logic.basic;

import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

@Component
public class Factorial {
	
	public int factorialNumWithJava8(int val) {
		return IntStream.rangeClosed(1, val).reduce(1, (i,j)->i*j);
	}
	public int factorialNum(int val) {
		var fact = 1; 
		int i=1;
		
		while(i<=val) {
			fact=+fact*i;
			i++;
		}
		return fact;
	}

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		System.out.println(fact.factorialNum(4));
	}

}
