package com.java.logic.basic;

public class MaxProductSubarray {

    static int maxProduct(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int maxProd = arr[0];
        int minProd = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(arr[i], maxProd * arr[i]);
            minProd = Math.min(arr[i], minProd * arr[i]);

            result = Math.max(result, maxProd);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, -2, 4}; // Example array

        int maxProduct = maxProduct(array);
        System.out.println("Product of maximum product subarray: " + maxProduct);
    }
}

