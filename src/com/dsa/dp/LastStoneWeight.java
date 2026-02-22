package com.dsa.dp;

import java.util.Arrays;

public class LastStoneWeight {

	public static void main(String[] args) {
		
		int ls = lastStoneWeightII(new int[] {2,7,4,1,8,1});
		System.out.println(ls);
	}
	
	public static int lastStoneWeightII(int[] stones) {
		int sum = 0;
		for(int i=0;i<stones.length;i++) {
			sum += stones[i];
		}
		int n = stones.length;
        	int[][] dp= new int[n][sum];
        	for(int[] a :dp) {
        		
        			Arrays.fill(a, -1);
        		
        	}
	       return getMin(stones,0,0,sum,dp);
	    }

	    static int getMin(int[] stones, int i,int sum1, int sum,int[][] dp){
	        if(i==stones.length)
	            return Math.abs(sum1-(sum-sum1));
	        if(dp[i][sum1] != -1)
	        	return dp[i][sum1];
	        int option1 = getMin(stones,i+1,sum1+stones[i],sum,dp);
	        int option2 = getMin(stones,i+1,sum1,sum,dp);
	        return dp[i][sum1]=Math.min(option1,option2);
	         

	    }

}
