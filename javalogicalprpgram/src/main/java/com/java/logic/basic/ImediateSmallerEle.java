package com.java.logic.basic;

public class ImediateSmallerEle {
	
	public int[] immediateSmaller(int ar[]) {

		for(int i=0;i<=ar.length-1;i++) {
			
			if(i==ar.length-1) {
				 ar[i]=-1;
			 return ar;
			}
			if(ar[i]>ar[i+1])
			ar[i]=ar[i+1];
			else
				ar[i]=-1;
		}
		return ar;
	}
	
	public static void main(String[] args) {
	
		int arr[] = {4, 2, 1, 5, 3};
		
		ImediateSmallerEle im = new ImediateSmallerEle();
		arr = im.immediateSmaller(arr);
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
