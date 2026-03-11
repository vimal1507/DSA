package com.dsa.graph.shortestpath;

public class CityWiththeSmallestNoofNeighborsataThresholdDistance {

	public static void main(String[] args) {
		int n = 4;
		int[][]edges = new int[][] {{0,1,3},{1,2,1},{1,3,4},{2,3,1}};
		int distanceThreshold = 4;
		
		System.out.println(findTheCity(n,edges,distanceThreshold));

	}

	public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
		int[][] dist = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					dist[i][j] = 0;
				} else {
					dist[i][j] = Integer.MAX_VALUE;
				}
			}
		}
		for (int[] x : edges) {
			dist[x[0]][x[1]] = x[2];
			dist[x[1]][x[0]] = x[2];
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE
							&& dist[i][j] > dist[i][k] + dist[k][j]) {
						dist[i][j] = dist[i][k] + dist[k][j];
					}
				}
			}
		}

		int city = -1;
		int minDist = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (i != j && dist[i][j] <= distanceThreshold)
					count++;
			}

			if (count <= minDist) {
				minDist = count;
				city = i;
			}
		}
		return city;
	}
}
