package com.dsa;

import java.util.HashSet;
import java.util.Set;

public class LongestUploadedPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class LUPrefix {
    Set<Integer> set;
    int max = 0;
    public LUPrefix(int n) {
        set = new HashSet<>();
    }
    
    public void upload(int video) {
        set.add(video);
        while(set.contains(max+1)){
            max++;
        }
    }
    
    public int longest() {
        return max;
    }
}

/**
 * Your LUPrefix object will be instantiated and called as such:
 * LUPrefix obj = new LUPrefix(n);
 * obj.upload(video);
 * int param_2 = obj.longest();
 */
