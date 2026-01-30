package com.dsa;

public class Factorial {

	public static void main(String[] args) {
		int ans = totalZero(8735373);
		System.out.println(ans);

	}
	
	public static int totalZero(int num) {
		int result = 0;
		while(num>1) {
			int n = num/5;
			result += n;
			num = n;
		}
		return result;
	}

}
