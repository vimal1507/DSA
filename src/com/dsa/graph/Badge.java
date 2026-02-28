package com.dsa.graph;

public class Badge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	    public static void solve() {
	        int n = 3;//in.readInt();
	        int[] input = {0,2,3,2};
//	        int[] input = new int[n+1];
//	        for (int i = 1; i <= n; i++) {
//	            input[i] = in.readInt();
//	        }


	        for(int i = 1; i <= n; i++) {
	            boolean[] visited = new boolean[n+1];
	            int cur = i;
	            while(!visited[cur]) {
	                visited[cur] = true;
	                cur = input[cur];
	            }
	            System.out.print(cur+" ");
	        }
	    }
	}
