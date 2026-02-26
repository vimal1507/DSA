package com.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphValidTree {

	public static void main(String[] args) {
		int n = 5;
		int [][]edges = {{0, 1}, {0, 2}, {0, 3}, {1, 4}};
		boolean result = validTree(n, edges);
		System.out.println(result);

	}
	
	
	    public static boolean validTree(int n, int[][] edges) {
	        List<List<Integer>> graph = new ArrayList<>();
	        if(edges.length != n - 1)
	            return false;
	        for(int i =0; i<n;i++){
	            graph.add(new ArrayList<>());
	        }
	        // make graph
	        for(int[] e :edges){
	            graph.get(e[0]).add(e[1]);
	            graph.get(e[1]).add(e[0]);
	        }
	        // bfs
	        Queue<Integer> q = new LinkedList<>();
	        boolean[] visited = new boolean[n];
	        q.offer(0);
	        visited[0] = true;
	        int vCount = 0;
	        while(!q.isEmpty()){
	            int node = q.poll();
	            vCount++;
	            for(int i : graph.get(node)){
	                if(!visited[i]){
	                    visited[i] = true;
	                    q.offer(i);
	                }
	            }
	        }

	        return vCount == n;
	    }
	

}
