package com.dsa.dp;

public class ThreeTilinngIterative {

	public static void main(String[] args) {
		int n = 5;
		int[] arr = new int[n+1];
		if(n%2 != 0) {
			System.out.println(0);
			return;
		}
		if(n ==0) {
			System.out.println(1);
			return;
		}
		if(n == 2) {
			System.out.println(3);
			return;
		}
		
		arr[0] = 1;
		arr[2] = 3;
		
		for(int i=4; i<arr.length;i=i+2) {
			arr[i] = 4*arr[i-2]-arr[i-4];
		}
			
		System.out.println(arr[n]);

	}

}
