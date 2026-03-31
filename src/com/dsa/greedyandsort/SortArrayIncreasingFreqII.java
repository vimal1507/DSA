package com.dsa.greedyandsort;

import java.util.Arrays;

public class SortArrayIncreasingFreqII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] frequencySort(int[] nums) {
		int[] fre = new int[201];
		for (int x : nums) {
			fre[x + 100]++;
		}
		Integer[] temp = new Integer[nums.length];
		for (int s = 0; s < nums.length; s++) {
			temp[s] = nums[s];
		}
		Arrays.sort(temp, (a, b) -> {
			int afreq = fre[100 + a];
			int bfreq = fre[100 + b];
			if (afreq != bfreq) {
				return afreq - bfreq;
			}
			return b - a;
		});

		for (Integer v = 0; v < temp.length; v++) {
			nums[v] = temp[v];
		}

		return nums;
	}

}
