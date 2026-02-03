package com.dsa;

public class ClearDigit {

	public static void main(String[] args) {
		System.out.println(clearDigits("hgjas787gas"));

	}

	public static String clearDigits(String s) {
		char[] ch = s.toCharArray();
		char[] res = new char[ch.length];
		int j = 0;
		String resStr = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] > '9') {
				res[j] = ch[i];
				j++;
			} else {
				j--;
				res[j] = '0';
			}
		}
		for (int i = 0; i < ch.length; i++) {
			if (res[i] > '0') {
				resStr += res[i];
			}
		}
		return resStr;
	}

}
