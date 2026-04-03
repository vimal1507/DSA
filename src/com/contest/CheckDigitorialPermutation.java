package com.contest;

import java.util.Arrays;

public class CheckDigitorialPermutation {

	public static void main(String[] args) {
		System.out.println(isDigitorialPermutation(145));

	}

	public static boolean isDigitorialPermutation(int n) {
		int[] arr = new int[10];
		arr[0] = 1;

		for (int i = 1; i < arr.length; i++) {
			arr[i] = i * arr[i - 1];
		}
		int nn = n;
		int sum = 0;
		while (nn != 0) {
			int temp = nn % 10;
			nn = nn / 10;
			sum += arr[temp];
		}

		String s1 = n + "";
		String s2 = sum + "";
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch2);
		Arrays.sort(ch1);
		String s3 = new String(ch1);
		String s4 = new String(ch2);

		return (s3.equals(s4)) ? true : false;

	}

}
