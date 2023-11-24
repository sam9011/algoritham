package com.java.logic.basic;

public class Fibonacci {
	
	
	public static void main(String[] args) {
	
		int val=10;
		int prev = 0;
		int next = 1;
		//0 1 1 2 3 5 8 13 21
		System.out.println(prev+"\n"+ next);
		for(int i=1;i<=val;i++) {
			int res= prev+next;
			System.out.println(res);
			prev=next;
			next=res;
		}
	}

}
