package com.contest;

public class CompareString {

	public static void main(String[] args) {
		String a = "((xx)xx)xx";
        String b = "(x((xx))x)(xx)";
        System.out.println((convert(a).equals(convert(b)))?"Yes":"No");

	}
	private static String convert(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            sb.append(s.charAt(i));
            int n = sb.length();
            if(n >= 4 && sb.substring(n-4,n).equals("(xx)")){
                sb.setLength(n-4);
                sb.append("xx");
            }
        }
        return sb.toString();
    }
	
	/*
	 private String convert(String s){
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            st.push(s.charAt(i));
            String temp = "";
            if(st.size() >= 4){
                temp = st.pop()+temp;
                temp = st.pop()+temp;
                temp = st.pop()+temp;
                temp = st.pop()+temp;
            }
            if(temp.equals("(xx)")){
                st.push('x');
                st.push('x');
            }else if(temp !="" &&!temp.equals("(xx)")){
                st.push(temp.charAt(0));
                st.push(temp.charAt(1));
                st.push(temp.charAt(2));
                st.push(temp.charAt(3));
            }
        }
        for(char z : st){
            sb.append(z);
        }
        return sb.toString();
    }
	 */

}
