package com.dsa.binarysearch;

public class SplitArrayLargestSum {

	public static void main(String[] args) {
		System.out.println(splitArray(new int[] {7,2,5,10,8}, 2));

	}

	public static int splitArray(int[] nums, int k) {
		int low = 0;
		int high = 0;
		for (int x : nums) {
			low = Math.max(low, x);
			high += x;
		}
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (possible(nums, k, mid)) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

	private static boolean possible(int[] nums, int k, int max) {
		int cursum = 0;
		int count = 1;
		for (int d : nums) {
			if (cursum + d > max) {
				count++;
				cursum = d;
			} else {
				cursum += d;
			}
		}
		return count <= k;
	}

}
