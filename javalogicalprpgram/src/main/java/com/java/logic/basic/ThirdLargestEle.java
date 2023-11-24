package com.java.logic.basic;

import java.util.Arrays;

public class ThirdLargestEle {
	
	public int getThirdLargEle(int a[]) {
		if(a.length<3)
			return -1;
		
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=i+1;j<=a.length-1;j++) {
			    if(a[i]>a[j]) {
			    	a[i]+=a[j];
			    	a[j]=a[i]-a[j];
			    	a[i]=a[i]-a[j];
			    }
			}
		}
		return a[2];
	}
	
	public static void main(String[] args) {
		ThirdLargestEle tl = new ThirdLargestEle();
		int [] a = {26,45,125,566,55,65};
		
		System.out.println(tl.getThirdLargEle(a));
		
		for(int v:a) {
			System.out.print(v+" ");
		}
	}

}
