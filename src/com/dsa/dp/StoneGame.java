package com.dsa.dp;

import java.util.Arrays;

public class StoneGame {

	public static void main(String[] args) {
		boolean sg = stoneGame(new int[] {5,3,4,5});
		System.out.println(sg);


	}
	
	public static boolean stoneGame(int[] piles) {
        
		int[][] dp =new int[piles.length][piles.length];
		int res = select(piles,0,piles.length-1,dp);
		for(int[] a : dp) {
			Arrays.fill(a, -1);
		}
        
        if(res <0)
        	return false;
        else
        	return true;
    }

    private static int select(int[] piles, int i, int j, int[][] dp){
       if(i>j)
        return 0;
       if(dp[i][j] != -1)
    	   return dp[i][j];
       
        return dp[i][j]=Math.max(piles[0]-select(piles,i+1,j,dp),piles[j]-select(piles,i,j-1,dp));
    }

}


/*
    Input  piles = [5,3,4,5]
	Output: true
	
	a choose max from 0 or n-1 index value
	b choose max from 1 to n-2 or 1 to n-1 value
	
	D(n) = Math.max(a[0]+D(1,n-1),a[n-1]+D(0,n-2)
	
	
 */