package com.dsa.dp;

public class HouseRobber {

	public static void main(String[] args) {
			int[]nums = {1,2,3,1};
	        int n = nums.length;
	        System.out.println(Math.max(calculate(nums,0,n-2),calculate(nums,1,n-1)));
	    }

	    static int calculate(int[] x, int i, int j){
	        if(x.length == 1)
	        return x[0];
	        int p1 = 0;
	        int p2 = 0;
	        for(int k =i; k<=j; k++){
	           int cur = Math.max(p1,x[k]+p2);
	            p2 = p1;
	            p1 = cur;
	        }
	        return p1;
	    }
	}