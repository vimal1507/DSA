package com.dsa.String;

import java.util.Stack;

public class LongestValidParenthesesStack {

	public static void main(String[] args) {
		String s = ")()())";
		int ans = longestValidParentheses(s);
		System.out.println(ans);

	}

	    public static int longestValidParentheses(String s) {
	        Stack<Integer> st = new Stack<>();
	        int result = 0;
	        st.push(-1);
	        for(int i=0; i<s.length(); i++){
	            if(s.charAt(i) == '('){
	                st.push(i);
	            }else{
	                st.pop();
	                if(st.isEmpty()){
	                    st.push(i);
	                }else{
	                    result = Math.max(result,i-st.peek());
	                }
	            }

	        }
	        return result;
	    }
}
