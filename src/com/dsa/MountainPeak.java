package com.dsa;

import java.util.Arrays;

public class MountainPeak {

	public static void main(String[] args) {
		int[] arr = {6,5,3,6};
		System.out.println(Arrays.toString(nextHigherPeak(arr)));
		

	}
	
	 public static int[] nextHigherPeak(int[] heights) {
		 	int[] res = new int[heights.length];
		 	for(int i=0;i<res.length;i++) {
		 		res[i] = -1;
		 	}
		 		for(int i=0;i<heights.length;i++) {
		 			int j= 0;
		 			for(j=i+1;j<heights.length;j++) {
		 				if(heights[i] < heights[j]) {
		 					res[i] = heights[j];
		 					break;
		 				}
		 			}	 			
		 		}
	        return res;
	    }

}
