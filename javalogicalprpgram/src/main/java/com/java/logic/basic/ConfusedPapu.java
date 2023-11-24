package com.java.logic.basic;

public class ConfusedPapu {
	
	public static int findDiff(Integer value){
		int rem=0;
		int temp=value;
		String rev = "";
		while(value>0){
			rem = value%10;
			value = value/10;
			if(rem==6)
				rem=rem+3;
			else if(rem==9)
				rem=rem-3;
			
			rev = rem+rev;
		}
		return (Integer.parseInt(rev)-temp);
	}
	
	public static void main(String[] args) {
	
		System.out.println(ConfusedPapu.findDiff(166));
		
	}

}
