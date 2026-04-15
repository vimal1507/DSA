package com.dsa.prefixsum;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		System.out.println(subsets(new int[] {1,2,3}));

	}
	
	public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        createSubset(result,temp,0,nums);
        return result;
    }
    private static void createSubset(List<List<Integer>> result, List<Integer> temp, int idx, int[] nums){
        if(idx == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        createSubset(result,temp,idx+1,nums);

        temp.remove(temp.size()-1);

        createSubset(result,temp,idx+1,nums);
    }

}
