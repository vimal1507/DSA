package com.dsa.binarysearch;

public class AllocateMinimumPages {

	public static void main(String[] args) {
		System.out.println(findPages(new int[] {12, 34, 67, 90}, 2));

	}

	public static int findPages(int[] arr, int k) {
		int n = arr.length;
		if (k > n)
			return -1;

		int low = 0, high = 0;
		for (int pages : arr) {
			low = Math.max(low, pages);
			high += pages;
		}

		int res = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (isPossible(arr, k, mid)) {
				res = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return res;
	}

	private static boolean isPossible(int[] arr, int k, int maxPages) {
		int students = 1, currentSum = 0;
		for (int pages : arr) {
			if (currentSum + pages > maxPages) {
				students++;
				currentSum = pages;
				if (students > k)
					return false;
			} else {
				currentSum += pages;
			}
		}
		return true;
	}

}
