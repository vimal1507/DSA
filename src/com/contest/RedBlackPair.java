package com.contest;

import java.util.Arrays;

public class RedBlackPair {

	public static void main(String[] args) {
		int n = 5;
		long[] dp = new long[5];
		Arrays.fill(dp, -1);
		System.out.println(cal(0,"RBRBR","BBBRB",dp));
	}
	private static long cal(int idx, String a, String b, long[] dp) {
        if (idx >= a.length()) {
            return 0;
        }
        if (dp[idx] != -1) {
            return dp[idx];
        }
        long ans = (a.charAt(idx) == b.charAt(idx) ? 0 : 1)
                + cal(idx + 1, a, b, dp);

        if (idx + 1 < a.length()) {
            long cost = Math.min(
                    (a.charAt(idx) == a.charAt(idx + 1) ? 0 : 1) +
                            (b.charAt(idx) == b.charAt(idx + 1) ? 0 : 1),
                    (a.charAt(idx) == b.charAt(idx) ? 0 : 1) +
                            (a.charAt(idx + 1) == b.charAt(idx + 1) ? 0 : 1)
            );
            ans = Math.min(ans, cost + cal(idx + 2, a, b, dp));
        }
        return dp[idx] = ans;
    }

}
