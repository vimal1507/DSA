package com.contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MergeAdjacentEqualElements {

	public static void main(String[] args) {
		int[] nums = {3,1,1,2};
		System.out.println(mergeAdjacent(nums));

	}

	
	public static List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> s = new Stack<>();
        for(int i=0; i<nums.length; i++){
            long curr = nums[i];
            while(!s.isEmpty() && s.peek() == curr){
                curr += s.pop();
            }
            s.push(curr);
            
        }
        return new ArrayList<Long>(s);
}
}
