package com.contest;

import java.util.Arrays;

public class ConstructUniformParityArrayII {

	public static void main(String[] args) {
		System.out.println(uniformArray(new int[] {1,4,7}));

	}
	    public static boolean uniformArray(int[] nums1) {
	        Arrays.sort(nums1);
	        if(nums1[0] %2 == 1){
	            return true;
	        }else{
	            for(int i=1; i<nums1.length; i++){
	            if(nums1[i]%2 != 0){
	              return false;
	            }
	        }
	        }
	        return true;
	    }
}
