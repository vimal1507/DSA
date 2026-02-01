package com.dsa;

import java.util.Arrays;

public class Prime {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int[] arr = new int[b+1];
		for(int i=2;i<=20;i++) {
            if(arr[i]==0) {
                for(int j =i*2;j<arr.length;j=j+i) {
                    arr[(int)j]=1;
                }
            }
        }

        for(long i = a; i< b;i++){
            if(arr[(int)i]==0)
            System.out.println(i);
        }

    }
}