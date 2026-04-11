package com.contest.binarysearch;

public class SuperPow {

	public static void main(String[] args) {
		System.out.println(superPow(2,new int[] {1,0}));

	}

	private static final int M = 1337;

	public static int superPow(int a, int[] b) {
		return solve(a, b, b.length - 1);
	}

	private static int solve(int a, int[] b, int idx) {
		if (idx < 0) {
			return 1;
		}
		a = a % M;

		int f = pow(solve(a, b, idx - 1), 10);
		int s = pow(a, b[idx]);

		return f * s % M;
	}

	private static int pow(int a, int b) {
		int result = 1;
		while (b > 0) {
			if (b % 2 == 1) {
				result = result * a % M;
			}
			a = a * a % M;
			b = b / 2;
		}
		return result;
	}
}
