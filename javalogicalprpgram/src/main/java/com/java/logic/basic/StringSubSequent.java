package com.java.logic.basic;

public class StringSubSequent {
	
	public boolean isSubSequence(String a,String b) {
		
		char ar[] = a.toCharArray();
		char ba[] =b.toCharArray();
		int temp = 0;
		boolean val = false;
		for(char c:ar) {
			for(int i=temp+1;i<ba.length;i++) {
				if(c==ba[i]) {
					temp=i;
					val = true;
					break;
				}else if(i==ba.length-1) {
					return false;
				}
			}
		}
		return val;
	}
	
	public static void main(String[] args) {
		
		String a="gksrek";
		String b = "geeksforgeeks";
		
		StringSubSequent sb = new StringSubSequent();
		System.out.println(sb.isSubSequence(a, b));
		
	}

}
