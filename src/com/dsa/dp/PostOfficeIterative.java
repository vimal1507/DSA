package com.dsa.dp;

import java.util.Arrays;

public class PostOfficeIterative {

	public static void main(String[] args) {
		int n = 10; //in.readInt();
        int p = 5;//in.readInt();
		int[] v = {1, 2, 3, 6, 7, 9, 11, 22, 44, 50};//in.readIntArray(n);
		int[][] dp = new int[n + 1][p + 1];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}

		int[][] count = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int mid = (i + j) / 2;
				for (int k = i; k <= j; k++) {
					count[i][j] += Math.abs(v[k] - v[mid]);
				}
			}

		}
		for (int i = 0; i < n; i++)
			dp[i][1] = count[0][i];

		for (int offices = 2; offices <= p; offices++) {
			for (int i = 0; i < n; i++) {

				for (int j = 0; j < i; j++) {
					if (dp[j][offices - 1] == -1)
						continue;

					int val = dp[j][offices - 1] + count[j + 1][i];

					if (dp[i][offices] == -1)
						dp[i][offices] = val;
					else
						dp[i][offices] = Math.min(dp[i][offices], val);
				}
			}
		}

		System.out.println(dp[n - 1][p]);
	}

}
