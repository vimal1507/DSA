package com.dsa.dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int l = lengthOfLIS(new int[] {10,9,2,5,3,7,101,18});
		System.out.println(l);

	}
	
	public static int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length+1][nums.length];
        for(int[] a : dp){
            Arrays.fill(a,-1);
        }
        return lis(nums,-1,0,dp);
    }

    private static int lis(int[] nums, int p, int cur, int[][] dp){
        if(cur == nums.length)
        return 0;
        if(dp[pre+1][cur] != -1)
        return dp[pre+1][cur];


        int case1 = lis(nums,pre,cur+1,dp);
        int case2 = 0;
        if(pre == -1 || nums[pre] < nums[cur]){
            case2 = 1+lis(nums,cur,cur+1,dp);
        }

        return dp[pre+1][cur] = Math.max(case1,case2);
    }

}


