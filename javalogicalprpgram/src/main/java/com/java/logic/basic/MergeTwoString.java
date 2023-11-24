package com.java.logic.basic;

public class MergeTwoString {

	
	public String merge(String a,String b) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<=(a.length()-1+b.length()-1/2);i++) {
			if(i<a.length()) {
			sb.append(a.charAt(i));
			}else {
				sb.append(b.substring(i+1));
				return sb.toString();
			}
			if(i<b.length())
				sb.append(b.charAt(i));
			else {
				sb.append(a.substring(i+1));
				return sb.toString();
			}
			
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="bye";
		MergeTwoString ms = new MergeTwoString();
		System.out.println(ms.merge(s1, s2));
	}
}
