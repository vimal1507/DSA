package com.dsa.graph;

import java.util.LinkedList;
import java.util.Queue;

public class PerfectSquareBFS {

	public static void main(String[] args) {
		int n = 12;
		int result = bfs(n);
		System.out.println(result);

	}

	private static int bfs(int n) {
		Queue<Integer> q = new LinkedList<>();
		boolean[] visited = new boolean[n+1];
		q.offer(n);
		visited[n] = true;
		int level = 0;
		while(!q.isEmpty()) {
			int size = q.size();
			level++;
			
			for(int i=0; i<size; i++) {
				int cur = q.poll();
				for(int j=1; j*j<=cur; j++) {
					int next = cur - j*j;
					if(next == 0)
						return level;
					if(!visited[next]) {
						visited[next] = true;
						q.offer(next);
					}
				}
			}
		}
		return level;
	}
	
	

}
