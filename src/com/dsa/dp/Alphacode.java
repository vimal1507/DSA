package com.dsa.dp;

import java.util.Arrays;

public class Alphacode {

	public static void main(String[] args) {
		int[] input = {3,3,3,3,3,3,3,3,3,3};
		
		int[] dp = new int[input.length];
        Arrays.fill(dp, -1);
		
		System.out.println(AlphacodeCount(input,0,dp));

	}
	
	static int AlphacodeCount(int[] input,int fi, int[] dp) {
		if(input.length == 0 || input == null)
            return 0;


        if(fi >= input.length)
            return 1;

        if(input[fi]==0)
            return 0;

        if(fi+1 == input.length)
            return 1;


        if(dp[fi] != -1)
            return dp[fi];

        int count = AlphacodeCount(input,fi+1,dp);

        if(input[fi]*10+input[fi+1] <= 26) {
            count += AlphacodeCount(input,fi+2,dp);
        }


        return dp[fi] = count;
    }

}
