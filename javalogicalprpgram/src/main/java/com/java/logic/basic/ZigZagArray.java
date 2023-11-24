package com.java.logic.basic;

public class ZigZagArray {
	
	public void zigZag(int arr[]){
		boolean plug = true;
		for(int i=0;i<arr.length-1;i++) {
			
			if((arr[i]>arr[i+1] && plug) || (arr[i]<arr[i+1] && !plug)) {
				arr[i]+=arr[i+1];
				arr[i+1] = arr[i]-arr[i+1];
				arr[i] = arr[i]-arr[i+1];
			}
			plug = !plug;
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {4, 3, 7, 8, 6, 2, 1};
		new ZigZagArray().zigZag(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}

