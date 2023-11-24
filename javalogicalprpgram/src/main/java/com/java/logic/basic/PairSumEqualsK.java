package com.java.logic.basic;

import java.util.HashMap;
import java.util.Map;

public class PairSumEqualsK {

    static int countPairsWithSumK(int[] arr, int K) {
        int count = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Calculate count of pairs
        for (int num : arr) {
            int complement = K - num;

            // If complement exists and it's not the same element
            if (frequencyMap.containsKey(complement) && (complement != num)) {
                count += frequencyMap.get(complement);
            }

            // If the element is half of K, avoid double counting
            if (complement == num) {
                count--;
            }
        }

        // Return half of the counted pairs (to avoid double counting)
        return count / 2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        int K = 6;

        int pairsCount = countPairsWithSumK(arr, K);
        System.out.println("Number of pairs with sum " + K + ": " + pairsCount);
    }
}
