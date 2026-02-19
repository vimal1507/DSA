package com.dsa.dp;

public class Boredom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	public static void solve() {
        int n = 3; //in.readInt();
        int[] a = {1,2,3}; //in.readIntArray(n);
        long[] points = new long[100001];
        for(int x : a){
            points[x] += x;
        }
        long p2 = 0;
        long p1 = points[1];

        for(int i=2; i<points.length; i++){
            long cur = Math.max(p1,p2+points[i]);
            p2 = p1;
            p1 = cur;
        }

        System.out.print(p1);
    }

}
