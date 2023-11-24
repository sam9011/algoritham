package com.java.logic.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueSubset {

	    public List<List<Integer>> subsetsWithDup(int[] nums) {
	        Arrays.sort(nums); // Sort the array to handle duplicates
	        List<List<Integer>> subsets = new ArrayList<>();
	        backtrack(nums, 0, new ArrayList<>(), subsets);
	        return subsets;
	    }

	    private void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> subsets) {
	        subsets.add(new ArrayList<>(path)); // Add the current subset to the result
	        
	        for (int i = start; i < nums.length; i++) {
	            // Skip duplicates to avoid generating duplicate subsets
	            if (i > start && nums[i] == nums[i - 1]) {
	                continue;
	            }
	            
	            path.add(nums[i]); // Add the current element to the subset
	            backtrack(nums, i + 1, path, subsets); // Recursively generate subsets starting from the next index
	            path.remove(path.size() - 1); // Backtrack by removing the current element
	        }
	    }

	    public static void main(String[] args) {
	        UniqueSubset subsetsFinder = new UniqueSubset();
	        int a[] = { 2, 4, 20, 10, 6, 8, 14, 9};
	        List<List<Integer>> result = subsetsFinder.subsetsWithDup(a);

	        System.out.println("Unique Subsets:");
	        for (List<Integer> subset : result) {
	            System.out.println(subset);
	        }
	    }
}
