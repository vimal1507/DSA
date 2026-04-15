package com.dsa.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

	public static void main(String[] args) {
		System.out.println(findMaxLength(new int[] {0,1,1,1,1,1,0,0,0}));

	}
	public static int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int longest = 0;
        int sum = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] == 0){
                sum += -1;
            }else{
                sum += 1;
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            longest = Math.max(longest,i-map.get(sum));
        }
        return longest;
    }

}
