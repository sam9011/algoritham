package com.java.logic.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SieveofEratosthenes {

	
	public List<Integer> sieveOfEratosthenes(int n) {
		List<Integer> l = new ArrayList<>();
		List<Integer> l1 = new ArrayList<>();
		
		IntStream.rangeClosed(2, n).forEach(l::add);
		l1.addAll(l);
		for(Integer v:l) {
			for(int i=v/2;i>1;i--) {
				if(v%i==0) {
					l1.remove(v);	
				}
			}
		}
		
		System.out.println(l1);
		return l1;
	} 
	
	public static void main(String[] args) {
		
		int n=10;
		SieveofEratosthenes soe = new SieveofEratosthenes();
		for(int v:soe.sieveOfEratosthenes(n)) {
			System.out.println(v);
		}
		
		
	}

}
