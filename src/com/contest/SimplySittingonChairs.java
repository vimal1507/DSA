package com.contest;

public class SimplySittingonChairs {

	public static void main(String[] args) {
		solve();
		solve2();

	}

	public static void solve() {
		int n = 3;
		int[] p = { 3, 2, 1 };
		int[] trap = new int[n + 1];

		for (int i = 0; i < n; i++) {
			if (p[i] > i + 1) {
				trap[p[i]] = 1;
			}
		}
		int maxSit = 0;
		for (int i = 0; i < n; i++) {
			if (trap[i + 1] == 0)
				maxSit++;
		}

		System.out.println(maxSit);
	}

	// 2nd method greedy
	public static void solve2() {
		int n = 3;
		int[] p = { 3, 2, 1 };
		boolean[] visited = new boolean[n + 1];
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (!visited[i + 1]) {
				count++;
			}
			visited[p[i]] = true;
		}
		System.out.println(count);
	}
}
