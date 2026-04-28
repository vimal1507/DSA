package com.contest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CountConnectedSubgraphswithEvenNodeSum {

	public static void main(String[] args) {
		System.out.println(evenSumSubgraphs(new int[] {1,0,1}, new int[][] {{0,1},{1,2}}));

	}
	    public static int evenSumSubgraphs(int[] nums, int[][] edges) {
	        List<List<Integer>> allsubset = new ArrayList<>();
	        List<List<Integer>> graph = new ArrayList<>();
	        for(int i = 0; i < nums.length; i++){
	            graph.add(new ArrayList<>());
	        }
	        for(int[] node : edges){
	            graph.get(node[0]).add(node[1]);
	            graph.get(node[1]).add(node[0]);
	        }
	        subset(nums,0,allsubset,new ArrayList<>());
	        int count = 0;
	        for(List<Integer> l : allsubset){
	            if(l.size() == 0){
	                continue;
	            }
	            int sum = 0;
	            for(int k : l){
	                sum += nums[k];
	            }
	            if(sum%2 != 0){
	                continue;
	            }
	            if(isConnected(l,graph)){
	                count++;
	            }
	        }
	        return count;
	    }

	    private static boolean isConnected(List<Integer> list, List<List<Integer>> graph) {

	        boolean[] present = new boolean[graph.size()];
	        boolean[] vis = new boolean[graph.size()];

	        for (int x : list) {
	            present[x] = true;
	        }

	        Queue<Integer> q = new LinkedList<>();

	        q.offer(list.get(0));
	        vis[list.get(0)] = true;

	        int count = 0;

	        while (!q.isEmpty()) {

	            int cur = q.poll();
	            count++;

	            for (int next : graph.get(cur)) {

	                if (present[next] && !vis[next]) {
	                    vis[next] = true;
	                    q.offer(next);
	                }
	            }
	        }

	        return count == list.size();
	    }

	    private static void subset(int[] nums, int idx, List<List<Integer>> allsubset,List<Integer> curset){
	        if(idx == nums.length){
	            allsubset.add(new ArrayList<>(curset));
	            return;
	        }

	        curset.add(idx);
	        subset(nums,idx+1,allsubset,curset);
	        curset.remove(curset.size()-1);
	        subset(nums,idx+1,allsubset,curset);
	    }
}
