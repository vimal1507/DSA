package com.contest.binarysearch;

public class SearchinRotatedSortedArray {

	public static void main(String[] args) {
		System.out.println(search(new int[] {4,5,6,7,0,1,2}, 0));

	}

	public static int search(int[] nums, int target) {
		int s = 0, e = nums.length - 1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[mid] >= nums[s]) {
				if (target >= nums[s] && target < nums[mid]) {
					e = mid - 1;
				} else {
					s = mid + 1;
				}
			} else {
				if (target > nums[mid] && target <= nums[e]) {
					s = mid + 1;
				} else {
					e = mid - 1;
				}
			}
		}
		return -1;
	}
}
