package com.dsa;

public class TheNumberOfProductNew {

	public static void main(String[] args) {
		solve();

	}
	
	public static void solve() {
        int a = 5;//in.readInt();
        int[] arr = {5, -3, 3, -1, 1};//in.readIntArray(a);
        int curSign = 1;
        long neg = 0;
        long pos = 1;
        for(int i = 0; i < a; i++) {
            if(arr[i] < 0)
                curSign *= -1;

            if(curSign == -1)
                neg++;
            else
                pos++;
        }

        long totalneg = pos*neg;
        long totalpos = pos*(pos-1)/2+neg*(neg-1)/2;
        System.out.println(totalneg +" "+totalpos);
    }

}
