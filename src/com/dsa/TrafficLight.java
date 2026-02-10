package com.dsa;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

public class TrafficLight {

	public static void main(String[] args) {
		int x = 8; //length of road
		int n = 3; //no of traffic light 
		
		int[] arr = {3,6,2};
		int[] result = new int[arr.length];
		
		TreeSet<Integer> ts = new TreeSet<>();
		TreeMap<Integer,Integer> tm = new TreeMap<>(); 
		
		ts.add(0);
		ts.add(x);
		tm.put(x, 1);
		
		for(int i=0; i<arr.length; i++) {
			
			int curr = arr[i];
			int left = ts.floor(curr);
			int right = ts.ceiling(curr);
			
			int oldMax = right - left;
			tm.put(oldMax, tm.get(oldMax)-1);
			
			if(tm.get(oldMax) == 0) {
				tm.remove(oldMax);
			}
			
			int l = curr-left;
			int r = right-curr;
			
			tm.put(l, tm.getOrDefault(l, 0)+1);
			tm.put(r, tm.getOrDefault(r, 0)+1);
			
			ts.add(curr);
			
			result[i] = tm.lastKey();
		}
		
		System.out.println(Arrays.toString(result));

	}

}
