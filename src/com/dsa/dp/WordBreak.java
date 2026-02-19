package com.dsa.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("leet");
		list.add("code");
		System.out.println(wordBreak("leetcode",list));
	}

	public static boolean wordBreak(String s, List<String> wordDict) {
		Set<String> ss = new HashSet<>(wordDict);
		boolean[] dp = new boolean[s.length() + 1];
		dp[0] = true;

		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j <= i; j++) {
				if (dp[j] && ss.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}

		}
		return dp[s.length()];
	}

}
