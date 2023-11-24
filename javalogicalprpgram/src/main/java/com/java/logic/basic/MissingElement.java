package com.java.logic.basic;

public class MissingElement {

    static int findMissingElement(int[] nums) {
        int n = nums.length + 1;
        // Calculate the sum of first N natural numbers
        int expectedSum = n * (n + 1) / 2;

        // Calculate the sum of elements in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // The missing element will be the difference between expected and actual sums
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int missingElement = findMissingElement(arr);
        System.out.println("The missing element is: " + missingElement);
    }
}