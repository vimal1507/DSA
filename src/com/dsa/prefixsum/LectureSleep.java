package com.dsa.prefixsum;

public class LectureSleep {

	public static void main(String[] args) {
		int n = 6;
		int k = 3;
		int[] a = {1, 3, 5, 2, 5, 4};
		int[] t = {1, 1, 0, 1, 0, 0};
		long initialSum = 0;
		int[] extraPoints = new int[n];

		for (int i = 0; i < n; i++) {
			if (t[i] == 1) {
				initialSum += a[i];
			} else {
				extraPoints[i] = a[i];
			}
		}

		long currentExtra = 0;
		for (int i = 0; i < k; i++) {
			currentExtra += extraPoints[i];
		}

		long maxExtra = currentExtra;
		for (int i = k; i < n; i++) {
			currentExtra = currentExtra - extraPoints[i - k] + extraPoints[i];
			maxExtra = Math.max(maxExtra, currentExtra);
		}

		System.out.println(initialSum + maxExtra);
	}

}