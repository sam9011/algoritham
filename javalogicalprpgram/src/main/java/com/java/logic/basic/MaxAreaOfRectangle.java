package com.java.logic.basic;

public class MaxAreaOfRectangle {
	
	public int area(int rect[]) {
		
		return rect[0]*rect[1];
	}

	public static void main(String[] args) {

		int rect[][] = {{1,2}, {3,4}, {5,6}};
		MaxAreaOfRectangle max = new MaxAreaOfRectangle();
		
		int area=0;
		int temp = 0;
		
		for(int r[]:rect) {
			temp = max.area(r);
			if(area<temp) {
				area = temp;
			}
		}
		System.out.println(area);
	}

}
