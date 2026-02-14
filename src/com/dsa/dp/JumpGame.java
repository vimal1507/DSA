package com.dsa.dp;

public class JumpGame {

	public static void main(String[] args) {
		int[] nums = {1,3,2,0,1};
		System.out.println(canJump(nums));

	}
	
	    public static boolean canJump(int[] nums) {
	       
	        int reachable = 0;
	        for(int i=0; i< nums.length; i++){
	          if(reachable < i)
	            return false;

	          reachable = Math.max(reachable,i+nums[i]);

	          if(reachable >= nums.length-1)
	            return true;
	        }
	        return true;
	    }

}
