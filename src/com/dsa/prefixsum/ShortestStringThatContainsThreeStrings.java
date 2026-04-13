package com.dsa.prefixsum;

public class ShortestStringThatContainsThreeStrings {

	public static void main(String[] args) {
		System.out.println(minimumString("abc", "bca", "aaa"));

	}

	public static String minimumString(String a, String b, String c) {
		String[] s = { a, b, c };
		int[][] permutation = { { 0, 1, 2 }, { 0, 2, 1 }, { 1, 0, 2 }, { 1, 2, 0 }, { 2, 0, 1 }, { 2, 1, 0 } };
		String res = "";
		for (int[] x : permutation) {
			String combine = merge(merge(s[x[0]], s[x[1]]), s[x[2]]);
			if (res.equals("") || combine.length() < res.length()) {
				res = combine;
			} else if (res.length() == combine.length() && combine.compareTo(res) < 0) {
				res = combine;
			}
		}
		return res;
	}

	private static String merge(String a, String b) {
		if (a.contains(b)) {
			return a;
		}
		for (int i = Math.min(a.length(), b.length()); i >= 0; i--) {
			if (a.endsWith(b.substring(0, i))) {
				return a + b.substring(i);
			}
		}
		return a + b;
	}

}
