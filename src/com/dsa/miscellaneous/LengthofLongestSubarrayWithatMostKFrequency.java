package com.dsa.miscellaneous;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LengthofLongestSubarrayWithatMostKFrequency {

	public static void main(String[] args) {
		System.out.println(maxSubarrayLength(new int[] {1,2,3,1,2,3,1,2}, 2));

	}

	public static int maxSubarrayLength(int[] nums, int k) {
		Queue<Integer> q = new LinkedList<>();
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (map.getOrDefault(nums[i], 0) >= k) {
				while (!q.isEmpty() && q.peek() != nums[i]) {
					int temp = q.poll();
					map.put(temp, map.getOrDefault(temp, 0) - 1);
				}
				q.poll();
				map.put(nums[i], map.getOrDefault(nums[i], 0) - 1);
			}
			q.offer(nums[i]);
			count = Math.max(count, q.size());
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		return count;
	}

}
