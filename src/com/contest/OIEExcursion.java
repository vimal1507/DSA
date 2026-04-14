package com.contest;

public class OIEExcursion {

	public static void main(String[] args) {
		solve();
		
	}
	    public static void solve() {
	        int n = 8;
	        int m = 5;
	        int[] a = {0, 4, 0, 2, 1, 0, 0, 3};

	        int count = 1, max = 1;

	        for (int i = 1; i < n; i++) {
	            if (a[i] == a[i - 1]) {
	                count++;
	            } else {
	                count = 1;
	            }
	            max = Math.max(max, count);
	        }

	        if (max >= m) {
	            System.out.println("NO");
	        } else {
	            System.out.println("YES");
	        }
	    }

}
