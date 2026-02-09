package com.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MinimumAbsoluteDifferenceBetweenElementsWithConstraint {

	public static void main(String[] args) {
		int x = 2;
		List<Integer> nums = new ArrayList<>();
		nums.add(4);
		nums.add(3);
		nums.add(2);
		nums.add(4);
		System.out.println(minAbsoluteDifference(nums,x));
	}
	
	public static int minAbsoluteDifference(List<Integer> nums, int x) {
        TreeSet<Integer> ts = new TreeSet<>();
        int result = Integer.MAX_VALUE;
        for(int i=x; i<nums.size(); i++){
            ts.add(nums.get(i-x));

            int curr = nums.get(i);

            Integer floor = ts.floor(curr); // give greater closest element (null dega jb set me sare bade ho)
            if(floor != null){
                result = Math.min(result, Math.abs(curr-floor));
            }
            Integer ceil = ts.ceiling(curr); // give smaller closest element (null dega jb set me sare chhote ho)
            if(ceil != null){
                result = Math.min(result, Math.abs(curr-ceil));
            }

            if(result == 0){
                return result;
            }
        }
        
        return result;
    }

}
