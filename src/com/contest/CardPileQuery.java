package com.contest;

public class CardPileQuery {

	public static void main(String[] args) {
		 int n = 5;
	        int q = 4;
	        int[] from = {1,4,1,4};
	        int[] to = {3,5,4,2};

//	        for (int i = 0; i < q; i++) {
//	            from[i] = in.readInt();
//	            to[i] = in.readInt();
//	        }
	        int[][] arr = new int[n + 1][2];

	        for (int i = 0; i < q; i++) {
	            int c = from[i];
	            int p = to[i];
	            if (arr[c][0] != 0) {
	                arr[arr[c][0]][1] = 0;
	            }
	            arr[c][0] = p;
	            arr[p][1] = c;
	        }

	        for (int i = 1; i <= n; i++) {
	            if (arr[i][0] != 0) {
	                System.out.print(0 + " ");
	            } else {
	                int count = 0;
	                int cur = i;
	                while (cur != 0) {
	                    count++;
	                    cur = arr[cur][1];
	                }
	                System.out.print(count + " ");
	            }
	        }

	}

}
