package com.dsa;

import java.util.LinkedList;
import java.util.Queue;

public class DistanceFromRootToGivenNode {

	// Java program to find distance of a given 
	// node from root. 


	// A Binary Tree Node 
	static class Node 
	{ 
	    int data; 
	    Node left, right; 
	}

	// A utility function to create a new Binary 
	// Tree Node 
	static Node newNode(int item) 
	{ 
	    Node temp = new Node(); 
	    temp.data = item; 
	    temp.left = null;
	    temp.right = null; 
	    return temp; 
	} 

	// Returns -1 if x doesn't exist in tree. Else 
	// returns distance of x from root 
	static int findDistance(Node root, int x) 
	{ 
	   Queue<Node> q = new LinkedList<>();
	   q.offer(root);
	   int dis = 0;
	   while(!q.isEmpty()) {
		   int size = q.size();
		   for(int i=0; i<size; i++) {
			   Node currNode = q.poll();
			   if(currNode.data == x) {
				   return dis;
			   }
			   
			   if(currNode.left != null) {
				   q.offer(currNode.left);
			   }
			   
			   if(currNode.right != null) {
				   q.offer(currNode.right);
			   }
		   }
		   
		   dis++;
	   }
	   return -1;
	} 

	// Driver Program to test above functions 
	public static void main(String[] args) 
	{ 
	    Node root = newNode(5); 
	    root.left = newNode(10); 
	    root.right = newNode(15); 
	    root.left.left = newNode(20); 
	    root.left.right = newNode(25); 
	    root.left.right.right = newNode(45); 
	    root.right.left = newNode(30); 
	    root.right.right = newNode(35); 

	    System.out.println(findDistance(root, 10)); 
	}
	}

