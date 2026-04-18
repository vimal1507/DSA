package com.dsa.prefixsum;

public class Fence {

	public static void main(String[] args) {
		int n = 7;
        int k = 3;
        int[] arr = {1, 2, 6, 1, 1, 7, 1};

        int[] pre = new int[n+1];
        for(int i=1; i<=n; i++){
            pre[i] = pre[i-1]+arr[i-1];
        }
        int sum = Integer.MAX_VALUE;
        int idx = 0;
        for(int i=k; i<=n; i++){

            if(sum > pre[i]-pre[i-k]){
                idx = i-k+1;
                sum = pre[i]-pre[i-k];
            }
        }
        System.out.println(idx);

	}
}
