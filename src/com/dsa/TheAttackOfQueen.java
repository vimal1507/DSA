package com.dsa;

import java.util.Scanner;

public class TheAttackOfQueen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			int result = 2 * (n - 1) + Math.min(x - 1, y - 1) + Math.min(x - 1, n - y) + Math.min(n - x, y - 1)
					+ Math.min(n - x, n - y);

			System.out.println(result);
		}

		sc.close();
	}
}
