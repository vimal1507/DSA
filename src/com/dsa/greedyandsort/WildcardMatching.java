package com.dsa.greedyandsort;

public class WildcardMatching {

	public static void main(String[] args) {
		String s = "aa", p = "a";
		System.out.println(isMatch(s, p));

	}

	public static boolean isMatch(String s, String p) {
		int si = 0, pi = 0, match = 0, star = -1;
		int sn = s.length(), pn = p.length();
		while (si < sn) {
			if (pi < pn && (s.charAt(si) == p.charAt(pi) || p.charAt(pi) == '?')) {
				pi++;
				si++;
			} else if (pi < pn && p.charAt(pi) == '*') {
				star = pi;
				match = si;
				pi++;
			} else if (star != -1) {
				pi = star + 1;
				match++;
				si = match;
			} else {
				return false;
			}
		}

		while (pi < pn && p.charAt(pi) == '*') {
			pi++;
		}
		return pi == pn;
	}

}
