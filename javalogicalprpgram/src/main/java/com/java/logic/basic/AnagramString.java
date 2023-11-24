package com.java.logic.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class AnagramString {

	public List<String> remAnagram(String s1,String s2){
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		List <String> res = new ArrayList<>();
		
		if(s1.length()>s2.length()) {
			for(char c:s2.toCharArray()) {
				l2.add(s1.indexOf(c));
			}
			IntStream.range(0, s1.length()).forEach(l1::add);
			l1.removeAll(l2);
			l1.sort((v,n)->v<n?1:v>n?-1:0);
			for(int n:l1) {
				s1 = s1.substring(0, n) + s1.substring(n + 1);
			}
		}else {
			for(char c:s1.toCharArray()) {
				l2.add(s2.indexOf(c));
			}
			IntStream.range(0, s2.length()).forEach(l1::add);
			l1.removeAll(l2);
			l1.sort((v,n)->v<n?1:v>n?-1:0);
			for(int n:l1) {
				s2 = s2.substring(0, n) + s2.substring(n + 1);
			}
		}
		res.add(s1);
		res.add(s2);
		return res;
	}
	
	public static void main(String[] args) {
		String s2 = "cddgk";
		String s1 = "gcd";
		
		AnagramString as = new AnagramString();
		
		System.out.println(as.remAnagram(s1, s2));
	}
}
