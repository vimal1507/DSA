package com.contest;

public class SimplySittingonChairs {

	public static void main(String[] args) {
		solve();

	}
	
	    public static void solve() {
	        int n = 3;
	        int[] p = {3,2,1};
	        int[] trap = new int[n+1];

	        for(int i=0; i<n; i++){
	            if(p[i] > i+1){
	                trap[p[i]] = 1;
	            }
	        }
	        int maxSit = 0;
	        for(int i=0; i<n; i++){
	            if(trap[i+1] == 0)
	                maxSit++;
	        }

	        System.out.println(maxSit);
	    }
}
