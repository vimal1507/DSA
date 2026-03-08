package com.contest;

public class SmallestBalancedIndex {

	public static void main(String[] args) {
		System.out.println(smallestBalancedIndex(new int[] {2,1,2}));

	}
	    public static int smallestBalancedIndex(int[] nums) {

	        int n = nums.length;
	        long sum = 0;
	        long multi = 1;
	        for(int x : nums)
	            sum += x;

	        for(int i=n-1; i>=0; i--){
	            if(multi > sum)
	                return -1;
	            if(multi == (sum-nums[i]))
	            return i;
	            
	            

	            multi *= nums[i];
	            sum -= nums[i];

	        }
	        return -1;
	    }

}
