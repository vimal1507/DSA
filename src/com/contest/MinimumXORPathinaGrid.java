package com.contest;

import java.util.Arrays;

public class MinimumXORPathinaGrid {

	public static void main(String[] args) {
		int[][] grid = {{1,2},{3,4}};
		System.out.println(minCost(grid));

	}

	public static int minCost(int[][] grid) {
		int[][][] dp = new int[grid.length][grid[0].length][1024];
		for (int[][] x : dp) {
			for (int[] y : x) {
				Arrays.fill(y, -1);
			}
		}

		return cal(grid, 0, 0, 0, dp);
	}

	private static int cal(int[][] grid, int i, int j, int xor, int[][][] dp) {
		if (i >= grid.length || j >= grid[0].length) {
			return Integer.MAX_VALUE;
		}

		xor = xor ^ grid[i][j];

		if (dp[i][j][xor] != -1) {
			return dp[i][j][xor];
		}

		if (i == grid.length - 1 && j == grid[0].length - 1)
			return dp[i][j][xor] = xor;

		int x = cal(grid, i + 1, j, xor, dp);
		int y = cal(grid, i, j + 1, xor, dp);
		return dp[i][j][xor] = Math.min(x, y);
	}

}
