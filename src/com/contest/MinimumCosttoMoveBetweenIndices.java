package com.contest;

public class MinimumCosttoMoveBetweenIndices {

	public static void main(String[] args) {

	}

	public static int[] minCost(int[] nums, int[][] queries) {
		int n = nums.length;
		int[] closest = new int[n];
		closest[0] = 1;
		closest[n - 1] = n - 2;

		for (int i = 1; i < n - 1; i++) {
			int leftDiff = nums[i] - nums[i - 1];
			int rightDiff = nums[i + 1] - nums[i];

			if (leftDiff <= rightDiff) {
				closest[i] = i - 1;
			} else {
				closest[i] = i + 1;
			}
		}

		long[] f = new long[n];
		for (int i = 1; i < n; i++) {
			long cost;
			if (closest[i - 1] == i) {
				cost = 1;
			} else {
				cost = nums[i] - nums[i - 1];
			}
			f[i] = f[i - 1] + cost;
		}

		long[] b = new long[n];
		for (int i = n - 2; i >= 0; i--) {
			long cost;
			if (closest[i + 1] == i) {
				cost = 1;
			} else {
				cost = nums[i + 1] - nums[i];
			}
			b[i] = b[i + 1] + cost;
		}

		int[] res = new int[queries.length];
		int idx = 0;

		for (int[] q : queries) {
			int l = q[0];
			int r = q[1];

			if (l < r) {
				res[idx++] = (int) (f[r] - f[l]);
			} else {
				res[idx++] = (int) (b[r] - b[l]);
			}
		}

		return res;
	}
}
