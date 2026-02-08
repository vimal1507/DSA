package com.dsa;

import java.util.Arrays;

public class SlidingWindowMedian {

	public static void main(String[] args) {
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		System.out.println(Arrays.toString(medianSlidingWindow(arr, 3)));

	}

	public static double[] medianSlidingWindow(int[] nums, int k) {
		int n = nums.length;

		double[] d = new double[n - k + 1];

		return d;
	}

}
