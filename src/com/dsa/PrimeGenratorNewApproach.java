package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class PrimeGenratorNewApproach {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		List<Integer> al = new ArrayList<Integer>();
		A: for (int j = a; j <= b; j++) {
			if (j == 1)
				continue A;
			for (int i = 2; i * i <= j; i++) {
				if (j % i == 0) {
					continue A;
				}

			}
			al.add(j);
		}
		for (Integer i : al) {
			System.out.println(i);
		}
		System.out.println();

	}

}
