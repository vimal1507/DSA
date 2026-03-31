package com.contest;

public class B_Array {

	public static void main(String[] args) {
		solve();

	}
	public static void solve() {
        int n = 10;//in.readInt();
        long[] input = {1, 9, 20, 9, 829, 3, 87, 1, 283, 7};//in.readLongArray(n);
        for(int i=0; i<n; i++){
            int s = 0;
            int l = 0;
            for(int j=i+1; j<n; j++){
                if(input[j] > input[i]){
                    l++;
                }else if(input[j] < input[i]){
                    s++;
                }
            }
            System.out.print(Math.max(s,l)+" ");
        }
        System.out.println();
    }

}
