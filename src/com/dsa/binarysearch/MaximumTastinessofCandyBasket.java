package com.dsa.binarysearch;

import java.util.Arrays;

public class MaximumTastinessofCandyBasket {

	public static void main(String[] args) {
		System.out.println(maximumTastiness(new int[] {13,5,1,8,21,2},3));

	}
	public static int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int low = 0;
        int high = price[price.length-1]-price[0];
        while(low <= high){
            int mid = low+(high-low)/2;
            if(canPick(price,k,mid)){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return high;
    }
    private static boolean canPick(int[] p, int k, int highest){
        int count = 1;
        int lastCandy = p[0];
        for(int i=1; i<p.length; i++){
            if(p[i]-lastCandy >= highest){
                count++;
                lastCandy = p[i];
            }
            if(count >= k){
                return true;
            }
        }
        return false;
    }
}
