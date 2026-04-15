package com.contest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestBalancedSubstringAfterOneSwap {

	public static void main(String[] args) {
		System.out.println(longestBalanced("100001"));

	}

	public static int longestBalanced(String s) {
		int n = s.length();

		int totalOnes = 0, totalZeroes = 0;
		for (char c : s.toCharArray()) {
			if (c == '1')
				totalOnes++;
			else
				totalZeroes++;
		}

		int[] prefOnes = new int[n + 1];
		int[] prefZeroes = new int[n + 1];

		for (int i = 0; i < n; i++) {
			prefOnes[i + 1] = prefOnes[i];
			prefZeroes[i + 1] = prefZeroes[i];

			if (s.charAt(i) == '1')
				prefOnes[i + 1]++;
			else
				prefZeroes[i + 1]++;
		}

		Map<Integer, List<Integer>> map = new HashMap<>();
		map.computeIfAbsent(0, k -> new ArrayList<>()).add(-1);

		int balance = 0, ans = 0;

		for (int i = 0; i < n; i++) {
			balance += (s.charAt(i) == '1') ? 1 : -1;

			if (map.containsKey(balance)) {
				for (int start : map.get(balance)) {
					ans = Math.max(ans, i - start);
					break;
				}
			}

			if (map.containsKey(balance - 2)) {
				for (int start : map.get(balance - 2)) {
					int l = start + 1;

					int zeroInside = prefZeroes[i + 1] - prefZeroes[l];

					if (totalZeroes - zeroInside > 0) {
						ans = Math.max(ans, i - start);
						break;
					}
				}
			}

			if (map.containsKey(balance + 2)) {
				for (int start : map.get(balance + 2)) {
					int l = start + 1;

					int onesInside = prefOnes[i + 1] - prefOnes[l];

					if (totalOnes - onesInside > 0) {
						ans = Math.max(ans, i - start);
						break;
					}
				}
			}

			map.computeIfAbsent(balance, k -> new ArrayList<>()).add(i);
		}

		return ans;
	}
}
