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

/*
 package main;

import input.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;

public class law {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        while (true) {
            String s = in.readString();
            if (s.equals("0"))
                break;

            long[] dp = new long[s.length() + 1];
            Arrays.fill(dp, -1);

            out.println(calPath(s, 0, dp));
        }
    }

    private long calPath(String s, int i, long[] dp) {
        if (i >= s.length()) {
            return 1;
        }

        if (s.charAt(i) == '0')
            return 0;

        if (dp[i] != -1) {
            return dp[i];
        }

        long ways = calPath(s, i + 1, dp);

        if (i + 1 < s.length()) {
            int num = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
            if (num <= 26) {
                ways += calPath(s, i + 2, dp);
            }
        }

        return dp[i] = ways;
    }
}
 
 */
