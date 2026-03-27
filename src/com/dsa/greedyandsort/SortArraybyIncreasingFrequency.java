package com.dsa.greedyandsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortArraybyIncreasingFrequency {

	public static void main(String[] args) {
		int[] input = {1,1,2,2,2,3};
		System.out.println(Arrays.toString(frequencySort(input)));
	}

	public static int[] frequencySort(int[] nums) {
		int[] res = new int[nums.length];
		Map<Integer, Integer> map = new HashMap<>();
		for (int x : nums) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}

		List<Map.Entry<Integer, Integer>> l = new ArrayList<>(map.entrySet());
		Collections.sort(l, (a, b) -> {
			if (a.getValue().equals(b.getValue())) {
				return b.getKey() - a.getKey();
			}
			return a.getValue() - b.getValue();
		});
		int idx = 0;
		for (Map.Entry<Integer, Integer> g : l) {
			for (int i = 1; i <= g.getValue(); i++) {
				res[idx++] = g.getKey();
			}
		}
		return res;
	}
}
