package com.java.logic.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueSubsetEven {

	    public int subsetsWithDup(int[] nums) {
	        Arrays.sort(nums); // Sort the array to handle duplicates
	        
	        nums = Arrays.stream(nums).filter(v->v%2==0).distinct().toArray();
	        List<List<Integer>> subsets = new ArrayList<>();
	        backtrack(nums, 0, new ArrayList<>(), subsets);
	        return subsets.size();
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
	        UniqueSubsetEven subsetsFinder = new UniqueSubsetEven();
	        int[] arr = {1, 2,4};
	        int a[] = { 2, 4, 20, 10, 6, 8, 14, 9};
	        int result = subsetsFinder.subsetsWithDup(a);

	        System.out.println("Unique Subsets count for even no:");
	            System.out.println(result);
	    }
}
