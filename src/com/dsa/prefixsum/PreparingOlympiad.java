package com.dsa.prefixsum;

public class PreparingOlympiad {

	public static void main(String[] args) {
		int n = 3;
		int l = 5;
		int r = 6;
		int x = 1;
		int[] arr = {1,2,3};
		int res = backtrack(arr, 0, Integer.MAX_VALUE, Integer.MIN_VALUE, 0, 0, l, r, x);
		System.out.println(res);

	}

	private static int backtrack(int[] arr, int idx, int min, int max, int sum, int size, int l, int r, int x) {
		if (idx == arr.length) {
			if (sum >= l && sum <= r && size >= 2 && max - min >= x) {
				return 1;
			} else {
				return 0;
			}
		}

		int take = backtrack(arr, idx + 1, Math.min(min, arr[idx]), Math.max(max, arr[idx]), sum + arr[idx], size + 1,
				l, r, x);
		int notTake = backtrack(arr, idx + 1, min, max, sum, size, l, r, x);

		return take + notTake;
	}

}
