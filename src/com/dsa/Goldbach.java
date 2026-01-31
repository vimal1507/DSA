package com.dsa;

public class Goldbach {

	public static void main(String[] args) {

		String s = gold(9);
		System.out.println(s);
	}

	public static String gold(int n) {
		if (n <= 2 || n%2 !=0) {
			return "Goldbach's conjecture not applicable";
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n%2==0 && isPrime(i) && isPrime(n - i)) {
				return (n + "=" + i + "+" + (n - i));
			}
		}
		return "Goldbach's conjecture is wrong.";
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
