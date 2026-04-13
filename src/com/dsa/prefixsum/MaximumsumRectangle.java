package com.dsa.prefixsum;

public class MaximumsumRectangle {

	public static void main(String[] args) {
		

	}

	public int maxRectSum(int mat[][]) {

		return maximumSumRectangle(mat.length, mat[0].length, mat);
	}

	int maximumSumRectangle(int R, int C, int M[][]) {
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < R; i++) {
			int[] temp = new int[C];

			for (int j = i; j < R; j++) {

				for (int k = 0; k < C; k++) {
					temp[k] += M[j][k];
				}

				int currentKadaneSum = kadane(temp);
				maxSum = Math.max(maxSum, currentKadaneSum);
			}
		}
		return maxSum;
	}

	private int kadane(int[] arr) {
		int maxSoFar = arr[0];
		int currentMax = arr[0];
		for (int i = 1; i < arr.length; i++) {
			currentMax = Math.max(arr[i], currentMax + arr[i]);
			maxSoFar = Math.max(maxSoFar, currentMax);
		}
		return maxSoFar;
	}
}
