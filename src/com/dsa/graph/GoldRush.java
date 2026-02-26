package com.dsa.graph;

import java.util.LinkedList;
import java.util.Queue;

public class GoldRush {

	public static void main(String[] args) {
		 int m = 6;//in.readInt();
	        int x = 4;//in.readInt();

	        boolean res = gr(m,x);
	        if ((res)) {
	            System.out.println("YES");
	        } else {
	            System.out.println("NO");
	        }

	}
	
	public static boolean gr(int m, int x) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(m);

        while (!q.isEmpty()) {
            Integer k = q.poll();

            if (k == x)
                return true;

            if (k % 3 == 0) {
                q.offer(k / 3);
                q.offer(2 * k / 3);
            }
        }
        return false;
    }

}
