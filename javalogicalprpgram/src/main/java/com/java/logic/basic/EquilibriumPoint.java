package com.java.logic.basic;

public class EquilibriumPoint {

    static int findEquilibrium(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int value : arr) {
            totalSum += value;
        }

        for (int i = 0; i < arr.length; i++) {
            // Deduct the current element from the totalSum to get the right sum
            totalSum -= arr[i];

            if (leftSum == totalSum) {
                // Equilibrium point found at index i (1-based indexing)
                return i + 1;
            }

            leftSum += arr[i];
        }

        // No equilibrium point found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int equilibrium = findEquilibrium(arr);
        if (equilibrium != -1) {
            System.out.println("The equilibrium point is at index: " + equilibrium);
        } else {
            System.out.println("No equilibrium point found.");
        }
    }
}
