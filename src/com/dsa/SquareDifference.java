package com.dsa;

public class SquareDifference {

	public static void main(String[] args) {
		int[] primes = new int[10000000];
		for(int i =2;i<primes.length;i++) {
			if(primes[i] == 0) {
				for(int j=i*2;j<primes.length;j=j+i) {
					primes[j]=1;
				}
			}
		}
		int a = 34;
		int b = 33;
		if(a-b == 1 && primes[a+b]==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
	

}
