package com.dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	    public List<List<Integer>> levelOrder(TreeNode root) {
	        Queue <TreeNode> q = new LinkedList<>();
	        List<List<Integer>> al = new ArrayList<>();
	        
	        if(root == null){
	            return al;
	        }

	        q.offer(root);

	        while(!q.isEmpty()){
	            int totalNode = q.size();
	            List<Integer> currLavelChild = new ArrayList<>();

	            for(int i=0; i<totalNode; i++){
	                TreeNode currNode = q.poll();
	                currLavelChild.add(currNode.val);

	                if(currNode.left != null){
	                    q.offer(currNode.left);
	                }

	                if(currNode.right != null){
	                    q.offer(currNode.right);
	                }              
	            } 
	             al.add(currLavelChild);
	        }
	        
	        
	        return al;
	    }
}
