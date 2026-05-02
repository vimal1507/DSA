package com.contest;

import java.util.Arrays;

public class Q456 {

	public static void main(String[] args) {
		solve();

	}

	public static void solve() {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = { 1, 2, 3, 4, 5, 6 };
		int[] c = { 1, 2, 3, 4, 5, 6 };
		int result = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				for (int k = 0; k < 6; k++) {
					int[] temp = new int[3];
					temp[0] = a[i];
					temp[1] = b[j];
					temp[2] = c[k];
					Arrays.sort(temp);
					if (temp[0] == 4 && temp[1] == 5 && temp[2] == 6) {
						result++;
					}
				}
			}
		}
		System.out.println(result / 216.0);
	}

}
