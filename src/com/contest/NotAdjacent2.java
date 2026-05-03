package com.contest;

import java.util.Arrays;

public class NotAdjacent2 {

	public static void main(String[] args) {
		solve();

	}

	static int MOD = 998244353;

	public static void solve() {
		String s = "cabcabcbcaccacbcbcaabacbacaabccacbccbcacbacbacabcacabcaccaaaaabababcbabacaccabbcacbcbcbcababcbcbabca";
		int n = s.length();

		long[][] dp = new long[n][27];
		for (long[] row : dp) {
			Arrays.fill(row, -1);
		}

		long ans = solve(s, 0, -1, dp);
		System.out.println(ans);
	}

	static long solve(String s, int i, int last, long[][] dp) {
		if (i == s.length())
			return 0;

		if (dp[i][last + 1] != -1)
			return dp[i][last + 1];

		long res = solve(s, i + 1, last, dp);

		int cur = s.charAt(i) - 'a';

		if (last == -1 || last != cur) {
			res = (res + 1 + solve(s, i + 1, cur, dp)) % MOD;
		}

		return dp[i][last + 1] = res;
	}

}
