package com.dsa.prefixsum;

public class IlyaandQueries {

	public static void main(String[] args) {
		String s = "......";
        int n = 4;
        int[] a = {3,2,1,2};
        int[] b = {4,3,6,6};
//        for(int i=0; i<n; i++){
//            a[i] = in.readInt();
//            b[i] = in.readInt();
//        }
        int[] pre = new int[s.length()];

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i)){
                pre[i] = pre[i-1]+1;
            }else{
                pre[i] = pre[i-1];
            }
        }

        for(int i = 0; i < n; i++){
            int x = pre[a[i]-1];
            int y = pre[b[i]-1];
            System.out.println(y - x);
        }

	}

}
