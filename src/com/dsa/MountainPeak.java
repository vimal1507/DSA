package com.dsa;

import java.util.Arrays;
import java.util.Stack;

public class MountainPeak {

	public static void main(String[] args) {
		int[] arr = {6,5,3,6};
		System.out.println(Arrays.toString(nextHigherPeak(arr)));
		

	}
	
	public static int[] nextHigherPeak(int[] heights) {
		 Stack<Integer> s = new Stack<>();
		 int n = heights.length;
		 int[] res = new int[n];
		 
		 for(int i = n-1;i>=0;i--){
		     while(!s.isEmpty() && s.peek() <= heights[i]){
		         s.pop();
		     }
		     
		     if(s.isEmpty()){
		         res[i] = -1;
		     }else{
		         res[i] = s.peek();
		     }
		     
		     s.push(heights[i]);
		 }
		 
		 return res;
	    }

}
