package com.dsa;

public class ClimbingStairs {

	public static void main(String[] args) {
		System.out.println(climbStairs(20));
	}
	public static int climbStairs(int n) {
        int a = 1;
        int b = 2;
        int res = 1;
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        if(n==2)
        return 2;
        for(int i=1;i<n-1;i++){
            int temp = b;
            res = a+b;
            b = res;
            a = temp;
        }
        return res;
        
    }

}
