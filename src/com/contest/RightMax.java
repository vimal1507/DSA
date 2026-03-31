package com.contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RightMax {

	public static void main(String[] args) {
		solve();
		solve2();
		solve3();
	}

	public static void solve() {
		int[] arr = { 6, 6, 6, 1, 7, 6 };
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

	// 2nd method
	public static void solve2() {
		int n = 6;
		int[] arr = { 6, 6, 6, 1, 7, 6 };
		int count = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max <= arr[i]) {
				count++;
				max = arr[i];
			}
		}
		System.out.println(count);
	}

	// 3rd method
	public static void solve3() {
		int n = 6;
		int[] arr = { 6, 6, 6, 1, 7, 6 };
		List<Pair> al = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			al.add(new Pair(arr[i], i));
		}
		Collections.sort(al, (a, b) -> a.value - b.value);
		int maxIndex = n - 1;
		int count = 0;

		for (int i = n - 1; i >= 0; i--) {
			if (al.get(i).index <= maxIndex) {
				count++;
				maxIndex = al.get(i).index;
			}
		}
		System.out.println(count);
	}

	static class Pair {
		int value;
		int index;

		Pair(int value, int index) {
			this.value = value;
			this.index = index;
		}

		public String toString() {
			return "value = " + this.value + " index = " + this.index;
		}

	}

}
