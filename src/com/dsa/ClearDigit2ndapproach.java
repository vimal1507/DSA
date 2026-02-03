package com.dsa;

public class ClearDigit2ndapproach {

	public static void main(String[] args) {
		System.out.println(clearDigits("iuyuttli56"));

	}

	public static String clearDigits(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i) <= '9') {
				if(sb.length() > 0) {
					sb.deleteCharAt(sb.length()-1);
				}
			}else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}

}
