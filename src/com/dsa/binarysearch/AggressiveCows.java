package com.dsa.binarysearch;

import java.util.Arrays;

public class AggressiveCows {

	public static void main(String[] args) {
		System.out.println(aggressiveCows(new int[] {1, 2, 4, 8, 9}, 3));

	}
	
	public static int aggressiveCows(int[] stalls, int k) {
        int n = stalls.length-1;
        Arrays.sort(stalls);
        int low = 0;
        int high = stalls[n];
        while(low <= high){
            int mid = low+(high-low)/2;
            if(isPossible(stalls,k,mid)){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return high;
    }
    
    private static boolean isPossible(int[] stalls, int k, int max){
        int count = 1;
        int ls = stalls[0];
        for(int i=1; i<stalls.length; i++){
            if(stalls[i]-ls >= max){
                count++;
                ls = stalls[i];
            }
            if(k==count){
                return true;
            }
        }
        return false;
    }

}
