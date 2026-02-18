package com.dsa.dp;

import java.util.Arrays;

public class PostOffice {

	public static void main(String[] args) {
		int n = 10; //in.readInt();
        int p = 5;//in.readInt();
        int[] v = {1, 2, 3, 6, 7, 9, 11, 22, 44, 50};//in.readIntArray(n);
        int[][] dp = new int[n][p+1];
        for(int[] a : dp){
            Arrays.fill(a, -1);
        }

        int[][] count = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int mid = (i + j)/2;
                for(int k = i; k <= j; k++){
                    count[i][j] += Math.abs(v[mid]-v[k]);
                }
            }
        }
        int result = minDistance(v,p,0,dp,count);
        System.out.println(result);


	}
	
	static int minDistance(int[] v,int p, int pos, int[][] dp,int[][] count) {
	        if(dp[pos][p] != -1)
	            return dp[pos][p];
	        if(p == 1)
	            return dp[pos][p]=count[pos][v.length-1];

	        if(pos >= v.length)
	            return 0;

	        int min = Integer.MAX_VALUE;

	            for (int i = pos; i <= v.length-p; i++) {
	                min = Math.min(minDistance(v, p - 1, i + 1,dp,count) + count[pos][i], min);
	            }
	        return dp[pos][p] = min;
	    }

}
