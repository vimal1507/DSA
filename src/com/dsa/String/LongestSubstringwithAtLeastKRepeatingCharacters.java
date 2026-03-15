package com.dsa.String;

public class LongestSubstringwithAtLeastKRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(longestSubstring("abbbbaaaghh",3));

	}
	    public static int longestSubstring(String s, int k) {
	        return helper(s,k,0,s.length());
	    }
	    private static int helper(String s, int k, int start, int end){
	        if (end - start < k) 
	            return 0;
	        int[] alp = new int[26];
	        for(int i=start; i<end; i++){
	            alp[s.charAt(i)-'a']++;
	        }
	        for(int i=start; i<end; i++){
	            if(alp[s.charAt(i)-'a'] < k){
	                int left = helper(s,k,start,i);
	                int right = helper(s,k,i+1,end);
	                return Math.max(left,right);
	            }
	        }
	        return end-start;
	    }
}
