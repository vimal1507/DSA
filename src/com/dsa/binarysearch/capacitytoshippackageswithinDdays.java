package com.dsa.binarysearch;

public class capacitytoshippackageswithinDdays {

	public static void main(String[] args) {
		System.out.println(shipWithinDays(new int[] {1,2,3,4,5,6,7,8,9,10}, 5));

	}
	
	public static int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int x: weights){
            low = Math.max(low,x);
            high += x; 
        }
        while(low <= high){
            int mid = low+(high-low)/2;
            if(isPossible(weights,days,mid)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    private static boolean isPossible(int[] weights, int days, int capacity) {
        int daysNeeded = 1;
        int currentLoad = 0;
        
        for (int w : weights) {
            if (currentLoad + w > capacity) {
                daysNeeded++;
                currentLoad = w;
            } else {
                currentLoad += w;
            }
        }
        return daysNeeded <= days;
    }

}
