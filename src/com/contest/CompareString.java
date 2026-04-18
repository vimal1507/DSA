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

}
