package com.dsa.dp;

import java.util.Arrays;

public class UniquePathsIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		 	int m = obstacleGrid.length;
		 	int n = obstacleGrid[0].length;
		 	int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
		 	for(int[] d : dp) {
		 		Arrays.fill(d, -1);
		 	}
		 	
		 	dp[0][0] = 1;
		 	for(int i=1; i<m; i++) {
		 		for(int j =1; j<n; j++) {
		 			
		 		}
		 	}
	      return 0;
	    }

}
