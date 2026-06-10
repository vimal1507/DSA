package com.contest;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		List<int[]> result = new ArrayList<>();
		permutation(arr,0,result);
		for(int[] x : result) {
			for(int k : x) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

	private static void permutation(int[] arr, int idx,List<int[]> result) {
		if(idx == arr.length) {
			result.add(arr.clone());
			return;
		}
		
		for(int i=idx; i<arr.length; i++) {
			swap(arr,idx,i);
			permutation(arr, idx+1, result);
			swap(arr,idx,i);
		}
		
	}

	private static void swap(int[] arr, int idx, int i) {
		int temp = arr[i];
		arr[i] = arr[idx];
		arr[idx] = temp;
		
	}

}
