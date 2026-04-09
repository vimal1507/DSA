package com.dsa.binarysearch;

import java.util.Arrays;

public class MinimizeMaxDistancetoGasStation {

	public static void main(String[] args) {
		System.out.println(minMaxDist(new int[] {1, 2, 3, 4, 5},2));

	}
	 public static double minMaxDist(int[] stations, int K) {
	        int n = stations.length;
	    Arrays.sort(stations);
	    double low = 0;
	    double high = stations[n-1]-stations[0];
	    for(int i=1; i<100; i++){
	        double mid = low+(high - low)/2.0;
	        if(isPossible(stations,K,mid)){
	            high = mid;
	        }else{
	            low = mid;
	        }
	    }
	    return high;   
	    }
	   private static boolean isPossible(int[] stations, int k, double maxDist) {
	        int count = 0;
	        for (int i = 0; i < stations.length - 1; i++) {
	            double diff = stations[i + 1] - stations[i];
	            count += (int)(diff / maxDist);
	        }
	        return count <= k;
	    }

}
