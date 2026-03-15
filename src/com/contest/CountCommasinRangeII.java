package com.contest;

public class CountCommasinRangeII {

	public static void main(String[] args) {
		System.out.println(1090000);

	}
	
        public long countCommas(long n) {
        long res = 0, p = 1000;
        for (int i = 1; i <= 5; ++i) {
            if (n >= p) {
                res += (n - p + 1);
            }
            p *= 1000;
        }
        return res;
    }
}
