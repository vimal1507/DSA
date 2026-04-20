package com.dsa.prefixsum;

public class PartitiontoKEqualSumSubsets {

	public static void main(String[] args) {
		System.out.println(canPartitionKSubsets(new int[] {4,3,2,3,5,2,1}, 4));

	}

	    public static boolean canPartitionKSubsets(int[] nums, int k) {
	        int sum = 0;
	        for (int x : nums) sum += x;
	        if (sum % k != 0) return false;

	        return backtrack(nums, new boolean[nums.length], 0, k, 0, sum / k);
	    }

	    private static boolean backtrack(int[] nums, boolean[] visited, int start, int k, int currentSum, int target) {
	        if (k == 1) return true;

	        if (currentSum == target) {
	            return backtrack(nums, visited, 0, k - 1, 0, target);
	        }

	        for (int i = start; i < nums.length; i++) {
	            if (!visited[i] && currentSum + nums[i] <= target) {
	                visited[i] = true;
	                if (backtrack(nums, visited, i + 1, k, currentSum + nums[i], target)) {
	                    return true;
	                }
	                visited[i] = false;
	            }
	        }
	        return false;
	    }
}
