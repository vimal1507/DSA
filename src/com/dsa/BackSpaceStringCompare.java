package com.dsa;

public class BackSpaceStringCompare {

	public static void main(String[] args) {
		System.out.println(backspaceCompare("ad#c","ab#c"));

	}

	public static boolean backspaceCompare(String s, String t) {
		StringBuilder sbs = new StringBuilder();
		StringBuilder sbt = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '#') {
				sbs.append(s.charAt(i));
			} else {
				if (sbs.length() > 0) {
					sbs.deleteCharAt(sbs.length() - 1);
				}
			}
		}

		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) != '#') {
				sbt.append(t.charAt(i));
			} else {
				if (sbt.length() > 0) {
					sbt.deleteCharAt(sbt.length() - 1);
				}
			}
		}

		return sbs.toString().equals(sbt.toString());

	}

}
