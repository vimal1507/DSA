package com.dsa.graph.shortestpath;

import java.util.Arrays;

public class NetworkDelayTimeBellmanFord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int networkDelayTime(int[][] times, int n, int k) {

		int[] dist = new int[n + 1];
		Arrays.fill(dist, Integer.MAX_VALUE);

		dist[k] = 0;

		for (int i = 1; i <= n - 1; i++) {
			for (int[] edge : times) {

				int u = edge[0];
				int v = edge[1];
				int w = edge[2];

				if (dist[u] != Integer.MAX_VALUE && dist[v] > dist[u] + w) {
					dist[v] = dist[u] + w;
				}
			}
		}

		int max = 0;

		for (int i = 1; i <= n; i++) {
			if (dist[i] == Integer.MAX_VALUE)
				return -1;

			max = Math.max(max, dist[i]);
		}

		return max;
	}

}
