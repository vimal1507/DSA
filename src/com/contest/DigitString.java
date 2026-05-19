package com.contest;

public class DigitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	    public void solve(int testNumber, InputReader in, PrintWriter out) {
	        String s = in.readString();
	        int n = s.length();
	        long[] prefix = new long[n + 1];
	        for (int i = 0; i < n; i++) {
	            prefix[i + 1] = prefix[i] + (s.charAt(i) == '2' ? 1 : 0);
	        }
	        long[] suffix = new long[n + 1];
	        for (int i = n - 1; i >= 0; i--) {
	            suffix[i] = suffix[i + 1] + (s.charAt(i) == '1' || s.charAt(i) == '3' ? 1 : 0);
	        }
	        long max = 0;
	        for (int i = 0; i <= n; i++) {
	            max = Math.max(max, prefix[i] + suffix[i]);
	        }

	        out.println(n - max);
	    }


}
