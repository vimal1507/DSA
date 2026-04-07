package com.dsa.prefixsum;

import java.util.Arrays;

public class PlatesBetweenCandles {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(platesBetweenCandles("***|**|*****|**||**|*",new int[][] {{1,17},{4,5},{14,17},{5,11},{15,16}})));


	}

	    public static int[] platesBetweenCandles(String s, int[][] queries) {
	        int n = s.length();
	        int[] preSum = new int[n];
	        int[] left = new int[n];
	        int[] right = new int[n];

	        int pCount = 0;
	        for (int i = 0; i < n; i++) {
	            if (s.charAt(i) == '*') pCount++;
	            preSum[i] = pCount;
	        }

	        int last = -1;
	        for (int i = 0; i < n; i++) {
	            if (s.charAt(i) == '|') last = i;
	            left[i] = last;
	        }

	        last = -1;
	        for (int i = n - 1; i >= 0; i--) {
	            if (s.charAt(i) == '|') last = i;
	            right[i] = last;
	        }

	        int[] res = new int[queries.length];
	        for (int i = 0; i < queries.length; i++) {
	            int startCandle = right[queries[i][0]];
	            int endCandle = left[queries[i][1]];

	            if (startCandle != -1 && endCandle != -1 && startCandle < endCandle) {
	                res[i] = preSum[endCandle] - preSum[startCandle];
	            } else {
	                res[i] = 0;
	            }
	        }
	        return res;
	    }

}
