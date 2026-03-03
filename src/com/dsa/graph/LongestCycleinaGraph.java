package com.dsa.graph;

public class LongestCycleinaGraph {

	public static void main(String[] args) {
		System.out.println(longestCycle(new int[] {3,3,4,2,3}));

	}

	public static int longestCycle(int[] edges) {
		int n = edges.length;
		boolean[] visited = new boolean[n];
		int[] timeVisited = new int[n];
		int time = 1;
		int max = -1;
		for (int i = 0; i < n; i++) {
			if (visited[i])
				continue;
			int node = i;
			int startTime = time;
			while (node != -1 && !visited[node]) {
				visited[node] = true;
				timeVisited[node] = time++;
				node = edges[node];
			}

			if (node != -1 && startTime <= timeVisited[node]) {
				max = Math.max(max, time - timeVisited[node]);
			}
		}
		return max;
	}
}
