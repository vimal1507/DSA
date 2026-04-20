package com.dsa.miscellaneous;

import java.util.LinkedHashMap;

public class LRUCache {

	public static void main(String[] args) {
		LRUCache l = new LRUCache(2);
		

	}
	
	LinkedHashMap<Integer,Integer> lm;
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        lm = new LinkedHashMap<>();
    }
    
    public int get(int key) {
       int v = lm.getOrDefault(key,-1);
       if(v != -1){
        lm.remove(key);
        lm.put(key,v);
       }     
       return v;
    }
    
    public void put(int key, int value) {
        if(lm.containsKey(key)){
            lm.remove(key);
        }
        else if(lm.size() == capacity){
            Integer firstKey = lm.keySet().iterator().next();
            lm.remove(firstKey);
        }
        lm.put(key,value);
    }
	

}
