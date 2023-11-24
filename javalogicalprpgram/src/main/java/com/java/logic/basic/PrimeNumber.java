package com.java.logic.basic;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {
	
	
	public static int isPrimeNum(int num) {
		var temp = 2;
		while(temp<=num/2) {
			
			if(num%temp==0) {
				return 0;
			}
			temp++;
		}		
		return 1;
	}
	
	public static boolean isPrimeNumJava8(int num) {

	return IntStream.rangeClosed(2, num/2).anyMatch(i->num%i==0);
	
	}
	
	public static void main(String[] args) {
		Integer num = 11;
		System.out.println(isPrimeNum(11));
		System.out.println(isPrimeNumJava8(11));
	}
}
