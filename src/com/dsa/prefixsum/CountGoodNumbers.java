package com.dsa.prefixsum;

public class CountGoodNumbers {

	public static void main(String[] args) {
		System.out.println(countGoodNumbers(5));

	}
	static long MOD = 1_000_000_007;

    public static int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        
        long firstPart = power(5, even);
        long secondPart = power(4, odd);
        
        return (int)((firstPart * secondPart) % MOD);
    }

    public static long power(long x, long y) {
        if (y == 0) return 1;
        
        long half = power(x, y / 2);
        
        if (y % 2 == 0) {
            return (half * half) % MOD;
        } else {
            return (x * half * half) % MOD;
        }
    }

}
