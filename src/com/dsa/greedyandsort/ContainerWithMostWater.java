package com.dsa.greedyandsort;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));

	}
	    public static int maxArea(int[] height) {
	        int i = 0;
	        int j = height.length-1;
	        int result = 0;
	        while(i<j){
	            int store = (j-i)*Math.min(height[i],height[j]);
	            result = Math.max(result,store);
	            if(height[i] >= height[j]){
	                j--;
	            }else{
	                i++;
	            }
	        }
	        return result;
	    }
}
