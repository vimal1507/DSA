package com.dsa.greedyandsort;

public class JumpGame2 {

	public static void main(String[] args) {
		int[] nums = {2,3,1,6,2,7,0,4,6};
		System.out.println(jump(nums));

	}
	    public static int jump(int[] nums) {
	        if (nums.length <= 1) return 0;

	        int jumps = 0;
	        int i = 0;

	        while (i < nums.length - 1) {
	            if (i + nums[i] >= nums.length - 1) {
	                return jumps + 1;
	            }

	            int maxReach = 0;
	            int nextIdx = i;
	            for (int j = i + 1; j <= i + nums[i]; j++) {
	                if (j + nums[j] > maxReach) {
	                    maxReach = j + nums[j];
	                    nextIdx = j;
	                }
	            }

	            i = nextIdx;
	            jumps++;
	        }
	        return jumps;
	    }

}
