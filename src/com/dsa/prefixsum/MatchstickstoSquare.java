package com.dsa.prefixsum;

import java.util.Arrays;

public class MatchstickstoSquare {

	public static void main(String[] args) {
		System.out.println(makesquare(new int[] {1,1,2,2,2}));

	}
	public static boolean makesquare(int[] matchsticks) {
        int total = 0;
        for (int m : matchsticks){
            total += m;
        }
              
        if (total % 4 != 0) 
            return false;

        int target = total / 4;
        
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        
        int[] sides = new int[4];
        return backtrack(0, matchsticks, sides, target);
    }
    
    private static boolean backtrack(int i, int[] sticks, int[] sides, int target) {
        if (i == sticks.length) return true;
        
        for (int j = 0; j < 4; j++) {
            if (sides[j] + sticks[i] <= target) {
                
                sides[j] += sticks[i];
                
                if (backtrack(i + 1, sticks, sides, target)) 
                    return true;
                
                sides[j] -= sticks[i];
            }
            
            if (sides[j] == 0) 
                break;
        }
        return false;
    }

    private static void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
        }
    }

}
