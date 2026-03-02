package com.dsa.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BipartitleGraph {

	public static void main(String[] args) {
		int[][] graph = {{1,3},{0,2},{1,3},{0,2}};
		boolean result = isBipartite(graph);
		System.out.println(result);
	}

	public static boolean isBipartite(int[][] graph) {

		int n = graph.length;
		int[] group = new int[n];
		Arrays.fill(group, -1);
		for (int i = 0; i < n; i++) {
			if (group[i] != -1)
				continue;
			Queue<Integer> q = new LinkedList<>();
			q.offer(i);
			group[i] = 0;
			while (!q.isEmpty()) {
				int node = q.poll();
				for (int v : graph[node]) {
					if (group[v] == -1) {
						group[v] = 1 - group[node];
						q.offer(v);
					} else if (group[v] == group[node]) {
						return false;
					}
				}
			}
		}
		return true;
	}

}
