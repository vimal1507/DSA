package com.dsa.miscellaneous;

public class BitwiseANDofNumbersRange {

	public static void main(String[] args) {
		System.out.println(rangeBitwiseAnd(5,7));

	}

	public static int rangeBitwiseAnd(int left, int right) {
		while (right > left) {
			right = right & (right - 1);
		}
		return left & right;
	}
}
