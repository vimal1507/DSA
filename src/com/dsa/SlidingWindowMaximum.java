package com.dsa;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int[] arr = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		int[] maxSlidingWindow = maxSlidingWindow(arr,k);
		System.out.println(Arrays.toString(maxSlidingWindow));
	}

	public static int[] maxSlidingWindow(int[] nums, int k) {
		int n = nums.length;
		int[] res = new int[n-k+1];
		if(n==0) {
			return res; 
		}
		Deque<Integer> dq= new ArrayDeque<>();
		int ri = 0;
		
		for(int i=0; i<n; i++) {
			while(!dq.isEmpty() && dq.peekFirst() == i-k) {
				dq.pollFirst();
			}
			
			while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
				dq.pollLast();
			}
			
			dq.offer(i);
			
			if(i>=k-1) {
				res[ri++] = nums[dq.peekFirst()];
			}
			
		}
			return res;
		
	}

}
