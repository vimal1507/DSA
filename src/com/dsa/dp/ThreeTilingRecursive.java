package com.dsa.dp;

public class ThreeTilingRecursive {

	public static void main(String[] args) {
		int n = 12;
		int res = noOfWay(n);
		System.out.println(res);
	}

	private static int noOfWay(int n) {
		
		if(n%2 != 0)
			return 0;
		
		if(n == 0)
			return 1;
		
		if(n == 2)
			return 3;
		
		return 4*noOfWay(n-2)-noOfWay(n-4);
	}

}
