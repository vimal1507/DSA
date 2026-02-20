package com.dsa.dp;

import java.util.Arrays;

public class PalindromePartitioning {

	public static void main(String[] args) {
		String s = "aaabaa";
		int[] dp = new int[s.length() + 1];
		Arrays.fill(dp, -1);
		int result = palin(s,0,dp);
		System.out.println(result-1);

	}

	public static int palin(String s, int pos, int[] dp) {
		
		if (s.length() == pos)
			return 0;

		if (dp[pos] != -1)
			return dp[pos];
		

		int minCuts = Integer.MAX_VALUE;
		for (int i = pos; i < s.length(); i++) {
			if (isPalindrome(s, pos, i)) {
				int cut = palin(s, i+1, dp)+1;
				minCuts = Math.min(minCuts, cut); // thora sa yaha par doubt ho gya tha varna 100 % sahi tha
			}
		}

		return dp[pos] = minCuts;

	}

	private static boolean isPalindrome(String s, int l, int r) {
		while (l < r) {
			if (s.charAt(l) != s.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}
