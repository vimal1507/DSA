package com.dsa.dp;

public class Frog {

	public static void main(String[] args) {
		int[] h = {10,30,40,20};
		int n = 4;
		
		System.out.println(jump(h,n-1));
	}
	
	public static int jump(int[] h, int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return Math.abs(h[0]-h[1]);
        int one = jump(h,n-1)+Math.abs(h[n]-h[n-1]);
        int two = jump(h,n-2)+Math.abs(h[n]-h[n-2]);

        return Math.min(one,two);
    }

}
