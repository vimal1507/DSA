package com.dsa.dp;

public class ZeroOneKnapsack {

	public static void main(String[] args) {
		int[] A = {60, 100, 120};
		int[] B = {10, 20, 30};
		int C = 50;
		
		System.out.println(solve(A,B,C));

	}
	
	public static int solve(int[] A, int[] B, int C) {
        int n = A.length;
        int[][] dp = new int[n+1][C+1];
        
        for(int i =1; i<=n; i++){
            for(int w=1; w<=C; w++){
                if(B[i-1] <= w){
                    dp[i][w] = Math.max(dp[i-1][w],A[i-1]+dp[i-1][w-B[i-1]]);
                }else{
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
        return dp[n][C];
    }

}
