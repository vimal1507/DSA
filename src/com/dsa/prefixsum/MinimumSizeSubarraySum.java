package com.dsa.prefixsum;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		int target = 7;
		int[] nums = {2,3,1,2,4,3};
		System.out.println(minSubArrayLen(target, nums));

	}

	public static int minSubArrayLen(int target, int[] nums) {
		int f = 0;
		int s = 1;
		int sum = nums[f];
		int result = Integer.MAX_VALUE;
		while (s < nums.length) {
			if (sum >= target) {
				sum += nums[s];
				s++;
				System.out.println(s-f);
			} else {
				sum = nums[s-1];
				System.out.println(s-f);
				result = Math.min(result, s - f);
				f = s;
				s++;
			}
		}
		return result;
	}
}
