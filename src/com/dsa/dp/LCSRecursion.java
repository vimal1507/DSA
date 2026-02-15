package com.dsa.dp;

public class LCSRecursion {

	public static void main(String[] args) {
		String t1 = "abcde";
		String t2 = "ace";
		
		System.out.println(longestCommonSubsequence1(t1,t2));

	}

	public static int longestCommonSubsequence1(String text1, String text2) {
		return lcs(text1, text2, 0, 0);
	}

	public static int lcs(String s1, String s2, int i, int j) {

		if (i == s1.length() || j == s2.length())
			return 0;

		if (s1.charAt(i) == s2.charAt(j))
			return 1 + lcs(s1, s2, i + 1, j + 1);

		return Math.max(lcs(s1, s2, i + 1, j), lcs(s1, s2, i, j + 1));
	}

}
