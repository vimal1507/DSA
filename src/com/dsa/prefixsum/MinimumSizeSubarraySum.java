package com.dsa.prefixsum;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		int target = 7;
		int[] nums = { 2, 3, 1, 2, 4, 3 };
		System.out.println(minSubArrayLen(target, nums));

	}

	public static int minSubArrayLen(int target, int[] nums) {
		int i = 0;
		int j = 0;
		int length = Integer.MAX_VALUE;
		int sum = 0;

		while (j < nums.length) {
			sum += nums[j];

			while (sum >= target) {
				length = Math.min(length, j - i + 1);
				sum -= nums[i];
				i++;
			}
			j++;
		}

		return length == Integer.MAX_VALUE ? 0 : length;
	}
}
