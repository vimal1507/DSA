package com.dsa.dp;

public class LongestIncreasingSubsequenceReduceSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static int lis(int[] nums, int pre, int cur, int[][] dp){
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
