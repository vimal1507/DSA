package com.dsa.dp;

import java.util.Arrays;

public class FrogDP {

	public static void main(String[] args) {
		int[] h = {10,30,40,20};
		int n = 4;
		int[] dp = new int[n];
		Arrays.fill(dp, -1);
		System.out.println(jump(h,n-1,dp));

	}
	
	 public static int jump(int[] h, int n, int[] dp) {
         if (dp[n] != -1)
             return dp[n];
         if (n == 0)
             return 0;
         if (n == 1)
             return Math.abs(h[0] - h[1]);
         int one = jump(h, n - 1, dp) + Math.abs(h[n] - h[n - 1]);
         int two = jump(h, n - 2, dp) + Math.abs(h[n] - h[n - 2]);

         return dp[n] = Math.min(one, two);
     }

}
