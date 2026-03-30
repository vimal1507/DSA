package com.contest;

import java.util.PriorityQueue;

public class Understory {

	public static void main(String[] args) {
		solve();

	}

	    public static void solve() {
	        int q = 5;
//	        int[] a = new int[q];
//	        int[] b = new int[q];
//	        for(int i=1; i<=q; i++){
//	            a[i-1] = in.readInt();
//	            b[i-1] = in.readInt();
//	        }
	        int[] a = {1,1,1,2,1};
	        int[] b = {5,7,8,7,3};
	        PriorityQueue<Integer> pq = new PriorityQueue<>();

	        for(int i=0; i<q; i++){
	            if(a[i] == 1){
	                pq.offer(b[i]);
	            }else{
	                while(!pq.isEmpty() && pq.peek() <= b[i]){
	                    pq.poll();
	                }
	            }
	            System.out.println(pq.size());
	        }

	    }
}
