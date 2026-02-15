package com.dsa.dp;

public class LCS {

	public static void main(String[] args) {
		String t1 = "abcde";
		String t2 = "ace";
		
		System.out.println(longestCommonSubsequence(t1,t2));

	}
	 public static int longestCommonSubsequence(String text1, String text2) {
	        int n = text1.length();
	        int m = text2.length();
	        int[][]dp = new int[n+1][m+1];

	        for(int i=1; i<=n; i++){
	            for(int j=1; j<=m; j++){
	                if(text1.charAt(i-1)==text2.charAt(j-1)){
	                    dp[i][j] = 1+dp[i-1][j-1];
	                }else{
	                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
	                }
	            }
	        }
	        return dp[n][m];
	    }
}
