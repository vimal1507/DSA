package com.dsa;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SlidingWindowMedian {

	public static void main(String[] args) {
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		System.out.println(Arrays.toString(medianSlidingWindow(arr, 3)));

	}

	public static double[] medianSlidingWindow(int[] nums, int k) {
	    PriorityQueue<Integer> pql = new PriorityQueue<>(Collections.reverseOrder());
	    PriorityQueue<Integer> pqr = new PriorityQueue<>();
	    int n = nums.length;
	    double[] result = new double[n - k + 1];
	    Map<Integer, Integer> out = new HashMap<>();

	    for (int i = 0; i < k; i++) pql.offer(nums[i]);
	    for (int i = 0; i < k / 2; i++) pqr.offer(pql.poll());

	    result[0] = getMedian(pql, pqr, k);

	    for (int j = k; j < n; j++) {
	        int outEle = nums[j - k];
	        int inEle = nums[j];
	        int balance = 0;

	        out.put(outEle, out.getOrDefault(outEle, 0) + 1);

	        
	        if (!pql.isEmpty() && outEle <= pql.peek()) {
	            balance = -1;
	        } else {
	            balance = 1;
	        }

	       
	        if (!pql.isEmpty() && inEle <= pql.peek()) {
	            pql.offer(inEle);
	            balance++;
	        } else {
	            pqr.offer(inEle);
	            balance--;
	        }

	        
	        if (balance < 0) {
	            pql.offer(pqr.poll());
	        } else if (balance > 0) {
	            pqr.offer(pql.poll());
	        }

	        
	        while (!pql.isEmpty() && out.getOrDefault(pql.peek(), 0) > 0) {
	            out.put(pql.peek(), out.get(pql.peek()) - 1);
	            pql.poll();
	        }
	        while (!pqr.isEmpty() && out.getOrDefault(pqr.peek(), 0) > 0) {
	            out.put(pqr.peek(), out.get(pqr.peek()) - 1);
	            pqr.poll();
	        }

	        result[j - k + 1] = getMedian(pql, pqr, k);
	    }
	    return result;
	}
	private static double getMedian(PriorityQueue<Integer> pql, PriorityQueue<Integer> pqr, int k) {
		if (k % 2 != 0) {
			return (double) pql.peek();
		} else {
			
			return ((double) pql.peek() + (double) pqr.peek()) / 2.0;
		}
	}
}