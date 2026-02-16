package com.dsa.dp;

import java.util.Arrays;

public class TheTriangleDP {

	public static void main(String[] args) {
		int n = 5;
		int[][] a = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
		
		int[][] dp = new int[n][n];
		for(int i =0; i<dp.length; i++) {
			Arrays.fill(dp[i], -1);
		}
		int res = triangle(a,0,0,n,dp);
		
		System.out.println(res);
	}
	
	public static int triangle(int[][] a,int i, int j, int n,int[][] dp){
		if(dp[i][j] != -1)
			return dp[i][j];
        if(i == n-1)
            return a[i][j];

        int left = triangle(a,i+1,j,n,dp);
        int right = triangle(a, i+1,j+1,n,dp);
        return dp[i][j] = Math.max(left,right)+a[i][j];
    }

}
