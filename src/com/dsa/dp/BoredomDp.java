package com.dsa.dp;

import java.util.Arrays;

public class BoredomDp {

    public static void main(String[] args) {
        int[] x = {1,2,3};
        long[] y = new long[100]; // 100001 karke local me nhi chal ra tha
        for (int val : x) {
            y[val] += val;
        }

        long[] dp = new long[100];
        Arrays.fill(dp, -1);

        long res = calculate(y,0,dp);
        System.out.println(res);

    }

    private static long calculate(long[] y, int i,long[] dp) {
        if(i > y.length-1)
            return 0;

        if(dp[i] != -1)
            return dp[i];

        return dp[i]=Math.max(
                calculate(y, i+2, dp)+y[i],
                calculate(y, i+1, dp)
        );
    }
}