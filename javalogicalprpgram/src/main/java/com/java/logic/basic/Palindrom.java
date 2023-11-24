package com.java.logic.basic;

public class Palindrom {
	
	public String isPalindrom(int num) {
		var temp = num;
		var rem = 0;
		var ans = 0;
		while(num>=1) {
		
			rem = num % 10;
			num = num/10;
			ans = rem+ans*10;
			
		}  
		if(temp == ans)
		return "yes";
		else
			return "no";
	}

	public static void main(String[] args) {
		
		Palindrom pal = new Palindrom();
		System.out.println(pal.isPalindrom(555));
		
	}

}
