package com.dsa.graph.shortestpath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelayTime {

	public static void main(String[] args) {
		int [][] times = {{2,1,1},{2,3,1},{3,4,1}};
		int n = 4;
		int k = 2;
		System.out.println(networkDelayTime(times,n,k));

	}
	
	    public static int networkDelayTime(int[][] times, int n, int k) {

	        List<List<int[]>> graph = new ArrayList<>();

	        for(int i = 0; i <= n; i++){
	            graph.add(new ArrayList<>());
	        }

	        for(int[] t : times){
	            graph.get(t[0]).add(new int[]{t[1], t[2]});
	        }

	        int[] dist = new int[n + 1];
	        Arrays.fill(dist, Integer.MAX_VALUE);
	        dist[k] = 0;

	        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
	        pq.offer(new int[]{k, 0});

	        while(!pq.isEmpty()){

	            int[] cur = pq.poll();
	            int node = cur[0];
	            int d = cur[1];

	            if(d > dist[node]) continue;

	            for(int[] nei : graph.get(node)){

	                int next = nei[0];
	                int weight = nei[1];

	                if(dist[next] > dist[node] + weight){
	                    dist[next] = dist[node] + weight;
	                    pq.offer(new int[]{next, dist[next]});
	                }
	            }
	        }

	        int ans = 0;

	        for(int i = 1; i <= n; i++){
	            if(dist[i] == Integer.MAX_VALUE)
	                return -1;

	            ans = Math.max(ans, dist[i]);
	        }

	        return ans;
	    }
}
