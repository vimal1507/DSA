package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class Goldbach {

	public static void main(String[] args) {
		int n = 42;
		int[] arr = new int[n+1];
		List<Integer> s = new ArrayList<>();
		for(int i=2;i<=n;i++) {
			if(arr[i]==0) {
				for(int k = 2*i;k<=n;k=k+i) {
					arr[k]=1;
				}
				s.add(i);
			}
		}
		int i = 0;
		int j = s.size()-1;
		while(i<=j) {
		if(s.get(i)+s.get(j) == n) {
			System.out.println(n+" = "+s.get(i)+"+"+s.get(j));
			return;
		}else if(s.get(i)+s.get(j) > n) {
			j--;
		}
		else {
			i++;
		}
		}
	}
}
