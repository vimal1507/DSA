package com.contest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RightMax {

	public static void main(String[] args) {
		solve();

	}

	public static void solve() {
		int[] arr = { 6,6,6,1,7,6};
		int[] copy = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		Map<Integer, Integer> map = new HashMap<>();
		Arrays.sort(copy);
		int index = copy.length - 1;
		int count = 0;
		for (int i = copy.length - 1; i >= 0; i--) {

			while (map.getOrDefault(copy[index], 0) > 0 && copy[index] > arr[i]) {
				map.put(copy[index], map.get(copy[index]) - 1);
				index--;
			}
			if (arr[i] == copy[index]) {
				count++;
				index--;
			} else {
				map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			}
		}
		System.out.println(count);
	}

}
