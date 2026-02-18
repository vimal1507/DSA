package com.dsa.dp;

import java.util.Arrays;

public class PalindromeRecursion {

	public static void main(String[] args) {
		int n = 5;//in.readInt();
        String s = "Ab3bd";//in.readString();
        int[][] dp = new int[n][n];
        for(int[] row : dp)
            Arrays.fill(row, -1);
        int res = count(s,n,0,n-1,dp);
        System.out.println(res);
    }

    static int count(String s, int n, int i, int j,int[][] dp) {
        if(i >= j)
            return 0;

        if(dp[i][j] != -1)
            return dp[i][j];
        if(s.charAt(i) == s.charAt(j))
            return  dp[i][j] = count(s,n,i+1, j-1,dp);

        return dp[i][j]=Math.min(count(s,n,i+1,j,dp),count(s,n,i,j-1,dp)) + 1;

    }

}
