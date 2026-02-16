package com.dsa.dp;

public class TheTriangle {

	public static void main(String[] args) {
		int n = 5;
		int[][] a = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
		int res = triangle(a,0,0,n);
		System.out.println(res);
	}
	
	public static int triangle(int[][] a,int i, int j, int n){
        if(i == n-1)
            return a[i][j];

        int left = triangle(a,i+1,j,n);
        int right = triangle(a, i+1,j+1,n);
        return Math.max(left,right)+a[i][j];
    }

}
