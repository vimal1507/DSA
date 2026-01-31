package com.dsa;

public class DivisiblityofDifferences {

	public static void main(String[] args) {
		int n = 3;
		int k = 2;
		int m = 3;
		int[] arr = {1,8,4};
		int count = 0;
		int[] temp = new int[m];
		for(int i=0;i<arr.length;i++) {
			temp[arr[i]%2]++;
		}

		for(int i=0;i<temp.length;i++) {
			if(temp[i]==k) {
				System.out.println("yes");
				return;
			}
		}
		
		System.out.println("no");
	}

}
