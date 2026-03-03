package com.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewofBinaryTree {
	
		static class Node {
		    int data;
		    Node left;
		    Node right;

		    Node(int data) {
		        this.data = data;
		        left = null;
		        right = null;
		    }
		}
		
	    static class Pair{
	        Node node;
	        Integer hd;
	        
	        Pair(Node node, Integer hd){
	            this.node = node;
	            this.hd = hd;
	        }
	        
	        public static void main(String[] args) {
	    		

	    	}
	    
	    public ArrayList<Integer> bottomView(Node root) {
	        ArrayList<Integer> al = new ArrayList<>();
	        TreeMap<Integer,Integer> map = new TreeMap<>();
	        Queue<Pair> q = new LinkedList<>();
	        q.offer(new Pair(root,0));
	        while(!q.isEmpty()){
	            Pair temp = q.poll();
	            Node cur = temp.node;
	            Integer hd = temp.hd;
	            
	            map.put(hd,cur.data);
	            
	            if(cur.left != null){
	                q.offer(new Pair(cur.left,hd-1));
	            }
	            
	            if(cur.right != null){
	                q.offer(new Pair(cur.right,hd+1));
	            }
	        }
	        
	        return new ArrayList<>(map.values());
	        
	    }
	}
}
