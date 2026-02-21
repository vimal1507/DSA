package com.dsa.dp;

public class UniquePaths {

	public static void main(String[] args) {
		 int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
		int result = uniquePathsWithObstacles(obstacleGrid);
		System.out.println(result);
	}
	
	 public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		 
	       return countPaths(obstacleGrid,0,0);
	    }

	private static int countPaths(int[][] obstacleGrid, int i, int j) {
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		
		 if (i >= m || j >= n || obstacleGrid[i][j] == 1)
	            return 0;

	        
	       if (i == m - 1 && j == n - 1)
	            return 1;

	       
		
		return countPaths(obstacleGrid,i+1,j)+countPaths(obstacleGrid, i, j+1);
	}


}
