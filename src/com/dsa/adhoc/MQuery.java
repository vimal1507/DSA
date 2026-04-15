package com.dsa.adhoc;

public class MQuery {

	public static void main(String[] args) {
		int n = 5;
		int[] arr = {4, 2, 6, 1, 3};
		int m = 3;
		int[] l = {2,1,0};
		int[] r = {2,2,3};
		int[] prefix = new int[n+1];
		for(int i=1; i<=n; i++) {
			prefix[i] = prefix[i-1]+arr[i-1];
		}
		for(int i=0; i<m; i++) {
			int a = prefix[l[i]];
			int b = prefix[r[i]+1];
			System.out.println(b-a);
		}
	}

}


/*
 2) array [] n length
M queries
L r
Example:
5
4 2 6 1 3
3
2 2
1 2
0 3

Output:
6
8
13
 
*/