package com.java.logic.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmallestAndSecSmall {
	
	
	public Integer[] minAnd2ndMin(Integer[] a1) {
		Integer ar[]=new Integer[2];
		
		
		
		Set <Integer>s = new HashSet<>();
		s.addAll(Arrays.asList(a1));
		Integer a[]= new Integer[s.size()];
		 s.toArray(a);
		
		ar[0]=-1;
		ar[1]=-1;
		if(a.length<2)
		return ar;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					a[i]+=a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		 ar[0]=a[0];
		 ar[1]=a[1];
		return ar;
	}
	public static void main(String[] args) {
		Integer a[]= {5, 2, 4, 3, 2, 6};
		
		SmallestAndSecSmall sm = new SmallestAndSecSmall();
		
		for(Integer v:sm.minAnd2ndMin(a)) {
			System.out.println(v+" ");
		}
	}

}
