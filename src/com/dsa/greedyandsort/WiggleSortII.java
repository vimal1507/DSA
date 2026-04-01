package com.dsa.greedyandsort;

import java.util.Arrays;

public class WiggleSortII {

	public static void main(String[] args) {
		int[] nums = {1,5,1,1,6,4};
		wiggleSort(nums);
		System.out.println(Arrays.toString(nums));

	}
	
	    public static void wiggleSort(int[] nums) {
	        int n = nums.length-1;
	        int[] arr = Arrays.copyOf(nums,nums.length);
	        Arrays.sort(arr);
	        for(int i=1;i<nums.length;i+=2){
	            nums[i]=arr[n--];
	        }
	        for(int i=0;i<nums.length;i+=2){
	            nums[i]=arr[n--];
	        }

	    }
}
