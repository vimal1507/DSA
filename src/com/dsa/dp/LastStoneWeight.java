package com.dsa.dp;

public class LastStoneWeight {

	public static void main(String[] args) {
		
		int ls = lastStoneWeightII(new int[] {2,7,4,1,8,1});
		System.out.println(ls);
	}
	
	public static int lastStoneWeightII(int[] stones) {
        
	       return getMin(stones,0,0,0);
	    }

	    static int getMin(int[] stones, int i,int sum1, int sum2){
	        if(i==stones.length)
	            return Math.abs(sum1-sum2);
	        int option1 = getMin(stones,i+1,sum1,sum2+stones[i]);
	        int option2 = getMin(stones,i+1,sum1+stones[i],sum2);

	        return Math.min(option1,option2);
	         

	    }

}
