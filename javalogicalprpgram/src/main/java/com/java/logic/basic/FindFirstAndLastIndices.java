package com.java.logic.basic;

import java.util.ArrayList;
import java.util.List;

public class FindFirstAndLastIndices {

	public Integer[] firstAndLast(int a[],int x) {
		List<Integer> l = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			if(x==a[i])
			l.add(i);
		}
		
		if(l.isEmpty())
			l.add(-1);
		
		return  l.toArray(new Integer[l.size()]);
	}
	
	public static void main(String[] args) {

		int arr[] = { 1, 3, 3, 4 };
		FindFirstAndLastIndices f = new FindFirstAndLastIndices();
		for(int i:f.firstAndLast(arr, 5)) {
			System.out.println(i);
		}
	}
}
