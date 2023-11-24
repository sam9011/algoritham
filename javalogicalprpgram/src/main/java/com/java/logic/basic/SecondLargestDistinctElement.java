package com.java.logic.basic;

import java.util.Arrays;

public class SecondLargestDistinctElement {

    static int getSecondLargestDistinct(int[] arr) {
        Arrays.sort(arr); // Sort the array

        int n = arr.length;
        int secondLargest = -1;

        // Find the second largest distinct element
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                secondLargest = arr[i];
                break;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 20, 15, 20, 8};

        int secondLargestDistinct = getSecondLargestDistinct(array);
        if (secondLargestDistinct != -1) {
            System.out.println("The second largest distinct element is: " + secondLargestDistinct);
        } else {
            System.out.println("No second largest distinct element found.");
        }
    }
}

