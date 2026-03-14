package com.dsa.String;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "abcabccd";
		System.out.println(lengthOfLongestSubstring(s));

	}

	public static int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int ans = 0;
		int left = 0;
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
			if (map.containsKey(curr) && map.get(curr) >= left) {
				left = map.get(curr) + 1;
			}
			map.put(curr, i);
			ans = Math.max(ans, i - left + 1);
		}
		return ans;
	}
}
