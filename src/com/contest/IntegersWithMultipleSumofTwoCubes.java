package com.contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class IntegersWithMultipleSumofTwoCubes {

	public static void main(String[] args) {
		System.out.println(findGoodIntegers(4104));

	}
	    public static List<Integer> findGoodIntegers(int n) {
	        List<Integer> ls = new ArrayList<>();
	        Map<Integer,Integer> map = new TreeMap<>();
	        for(int i=1; i*i*i<=n; i++){
	            for(int j=i; j*j*j<=n; j++){
	                if(i*i*i+j*j*j <= n){
	                    map.put(i*i*i+j*j*j,map.getOrDefault(i*i*i+j*j*j,0)+1);
	                }
	            }
	        }

	        for(Map.Entry<Integer, Integer> x:map.entrySet()) {
	        	if(x.getValue() > 1) {
	        		ls.add(x.getKey());
	        	}
	        }
	        return ls;
	    }

}
