package com.dsa.binarysearch;

public class MedianofTwoSortedArrays {

	public static void main(String[] args) {
		System.out.println(findMedianSortedArrays(new int[] {1,3}, new int[] {2}));

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int[] merge = new int[m + n];
		int i = 0, j = 0;
		int idx = 0;
		while (i < m && j < n) {
			if (nums1[i] <= nums2[j]) {
				merge[idx++] = nums1[i++];
			} else {
				merge[idx++] = nums2[j++];
			}
		}
		while (i < m) {
			merge[idx++] = nums1[i++];
		}
		while (j < n) {
			merge[idx++] = nums2[j++];
		}

		int ln = merge.length;

		if (ln % 2 != 0)
			return (double) merge[ln / 2];
		else
			return (merge[ln / 2] + merge[ln / 2 - 1]) / 2.0;
	}

}
