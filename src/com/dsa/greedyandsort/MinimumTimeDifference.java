package com.dsa.greedyandsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumTimeDifference {

	public static void main(String[] args) {
		List<String> timePoints = new ArrayList<>();
		timePoints.add("23:59");
		timePoints.add("00:00");
		System.out.println(findMinDifference(timePoints));
	}
	

	    public static int findMinDifference(List<String> timePoints) {
	    	if(timePoints.size() > 60*24) {
	    		return 0;
	    	}
	    	List<Integer> list = new ArrayList<>();
	    	for(int i=0; i<timePoints.size(); i++) {
	    		int h = Integer.parseInt(timePoints.get(i).substring(0,2));
	    		int m = Integer.parseInt(timePoints.get(i).substring(3));
	    		list.add(h*60+m);
	    	}
	    	Collections.sort(list);
	    	int minDiff = Integer.MAX_VALUE;
	    	for(int i=1; i<list.size(); i++) {
	    		minDiff = Math.min(minDiff, list.get(i)-list.get(i-1));
	    	}
	    	
	    	minDiff = Math.min(minDiff, 60*24+list.get(0)-list.get(list.size()-1));
	        return minDiff;
	    }

}
