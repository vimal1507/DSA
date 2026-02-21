package com.dsa.dp;

import java.util.Arrays;

public class UniquePathsDP {

	public static void main(String[] args) {
		 int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
		int result = uniquePathsWithObstacles(obstacleGrid);
		System.out.println(result);
	}
	
	 public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		 	int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
		 	for(int[] d : dp) {
		 		Arrays.fill(d, -1);
		 	}
	       return countPaths(obstacleGrid,0,0,dp);
	    }

	private static int countPaths(int[][] obstacleGrid, int i, int j,int[][] dp) {
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		
		 if (i >= m || j >= n || obstacleGrid[i][j] == 1)
	            return 0;

	        
	       if (i == m - 1 && j == n - 1)
	            return 1;

	       if(dp[i][j] != -1)
	    	   return dp[i][j];
		
		return dp[i][j] = countPaths(obstacleGrid,i+1,j,dp)+countPaths(obstacleGrid, i, j+1, dp);
	}


}
