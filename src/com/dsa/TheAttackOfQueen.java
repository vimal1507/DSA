package com.dsa;

public class TheAttackOfQueen {

	public static void main(String[] args) {
		
		int result = attack(150,62,41);
		System.out.println(result);
	}
	
	public static int attack(int n, int a, int b){
        return 2*(n-1)+ Math.min(a-1,b-1)+
        Math.min(a-1,n-b)+
        Math.min(n-a,b-1)+
        Math.min(n-a,n-b);
    }
}
