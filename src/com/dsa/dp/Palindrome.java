package com.dsa.dp;

public class Palindrome {

	public static void main(String[] args) {
		 int n = 5;//in.readInt();
	        String s = "Ab3bd";//in.readString();
	        String s1 = new StringBuilder(s).reverse().toString();
	        int[] dpPre = new int[n+1];
	        int[] dpCur = new int[n+1];
	       int res = td(s,s1,n,dpPre,dpCur);
	       System.out.println(n-res);
	    }

	    public static int td(String s,String s1,int n,int[] dpPre, int[] dpCur) {
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=n;j++){
	                if(s.charAt(i-1)==s1.charAt(j-1)){
	                    dpCur[j] = dpPre[j-1]+1;
	                }else{
	                    dpCur[j] = Math.max(dpPre[j],dpCur[j-1]);
	                }
	            }
	            int[] temp = dpCur;
	            dpCur = dpPre;
	            dpPre = temp;
	        }
	        return dpPre[n];
	    }
	}
