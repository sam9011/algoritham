package com.java.logic.basic;

public class PalindromString {
	
	public Boolean palindromString(String str) {
		String reverseString="";
		
		str.codePoints().forEach(System.out::println);
		for(int i=str.length()-1;i>=0;i--) {
			reverseString = reverseString+str.charAt(i);
		}
		if(str.equals(reverseString)) {
			return true;
		}else
			return false;
	}

	public static void main(String[] args) {
		PalindromString ps = new PalindromString();
		
		System.out.println(ps.palindromString("aba"));
	}
}
