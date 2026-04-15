package com.dsa.adhoc;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ConcurrentUser {

	public static void main(String[] args) {
		String[][] s = {{"2015-02-21T04:20:30","2015-02-21T05:20:30"},
				{"2015-03-01T06:08:45","2015-03-11T06:18:45"},
				{"2015-02-21T04:22:30","2015-03-21T05:20:30"}
				};
		Arrays.sort(s, (a, b) -> a[0].compareTo(b[0]));
		PriorityQueue<String> pq= new PriorityQueue<>();
		for(String[] x : s) {
			if(!pq.isEmpty() && pq.peek().compareTo(x[0]) <= 0) {
				pq.poll();
			}
			pq.offer(x[1]);
		}
		System.out.println(pq.size());
	}

}


/*
 1)Max concurrent users
Input first line n, followed by n-lines <start_time> <end_time>
Time format - yyyy-mm-ddThh:mm:ss
Example:

Input:
3
2015-02-21T04:20:30 2015-02-21T05:20:30
2015-03-01T06:08:45 2015-03-11T06:18:45
2015-02-21T04:22:30 2015-03-21T05:20:30

Output:
2

*/
