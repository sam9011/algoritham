package com.java.logic.basic;

public class KthSmallestElement {

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static int quickSelect(int[] arr, int low, int high, int k) {
        if (k > 0 && k <= high - low + 1) {
            int partitionIndex = partition(arr, low, high);

            if (partitionIndex - low == k - 1) {
                return arr[partitionIndex];
            }

            if (partitionIndex - low > k - 1) {
                return quickSelect(arr, low, partitionIndex - 1, k);
            }

            return quickSelect(arr, partitionIndex + 1, high, k - partitionIndex + low - 1);
        }

        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3; // Find the 3rd smallest element

        int kthSmallest = quickSelect(arr, 0, arr.length - 1, k);
        System.out.println("The " + k + "th smallest element is: " + kthSmallest);
    }
}
