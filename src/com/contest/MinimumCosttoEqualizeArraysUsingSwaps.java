package com.contest;

import java.util.HashMap;
import java.util.Map;

public class MinimumCosttoEqualizeArraysUsingSwaps {

	public static void main(String[] args) {
		int[] nums1 = {2,3,3};
		int[] nums2 = {1,1,2};
		System.out.println(minCost(nums1,nums2));

	}

	public static int minCost(int[] nums1, int[] nums2) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int x : nums1)
			map.put(x, map.getOrDefault(x, 0) + 1);

		for (int x : nums2)
			map.put(x, map.getOrDefault(x, 0) - 1);

		int cost = 0;

		for (int v : map.values()) {

			if (v % 2 != 0)
				return -1;

			if (v > 0)
				cost += v;
		}

		return cost / 2;
	}

}
