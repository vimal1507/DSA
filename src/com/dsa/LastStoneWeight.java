package com.dsa;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

	public static void main(String[] args) {
		int [] stones = {2,7,4,1,8,1};
		System.out.println(lastStoneWeight(stones));

	}
	
	    public static int lastStoneWeight(int[] stones) {
	    	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	    	
	    	for(int i=0; i<stones.length; i++) {
	    		pq.offer(stones[i]);
	    	}
	    	int x =0;
	    	int y=0;
	    	while(pq.size() > 1) {
	    		 x = pq.poll();
	    		 y = pq.poll();
	    		 
	    		 if(x != y) {
	 	    		pq.offer(x-y);
	 	    	}
	    	}
	  
	        
	         return (pq.isEmpty())?0:pq.poll();  
	    }
	

}
