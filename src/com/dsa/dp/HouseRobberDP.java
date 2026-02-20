package com.dsa.dp;

import java.util.Arrays;

public class HouseRobberDP {

	public static void main(String[] args) {
			int[]nums = {1,2,3,1};
	        int n = nums.length;
	        int[] dp = new int[n];
	        Arrays.fill(dp, -1);
	        System.out.println(rob(nums));
	    }

	 public static int rob(int[] nums) {

	        int n = nums.length;
	        if (n == 0) 
	            return 0;

	        if (n == 1) 
	            return nums[0];

	        int[] dp1 = new int[n + 1];
	        Arrays.fill(dp1, -1);

	        int[] dp2 = new int[n + 1];
	        Arrays.fill(dp2, -1);

	        int case1 = calculate(nums, 0, n - 2, dp1);
	        int case2 = calculate(nums, 1, n - 1, dp2);

	        return Math.max(case1, case2);
	    }

	    static int calculate(int[] x, int i, int j, int[] dp) {

	        if (i > j) 
	        	return 0;

	        if (dp[i] != -1) 
	        	return dp[i];

	        int rob = x[i] + calculate(x, i + 2, j, dp);
	        int skip = calculate(x, i + 1, j, dp);

	        return dp[i] = Math.max(rob, skip);
	    }
	}