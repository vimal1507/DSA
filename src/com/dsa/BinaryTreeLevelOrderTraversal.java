package com.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
	    public List<List<Integer>> levelOrder(TreeNode root) {

	        Stack<TreeNode> s = new Stack<>();
	        List<List<Integer>> al = new ArrayList<>();
	        
	        if(root == null){
	            return al;
	        }
	        
	        s.push(root);

	        while(!s.isEmpty()){
	            List<Integer> tempList = new ArrayList<>();
	            int size = s.size();
	            Stack<TreeNode> tempStack = new Stack<>();

	            for(int i=0; i<size; i++){
	                TreeNode currNode = s.pop();
	                tempList.add(currNode.val);
	                
	                if(currNode.left != null){
	                    tempStack.push(currNode.left);
	                }

	                if(currNode.right != null){
	                    tempStack.push(currNode.right);
	                }
	            }

	            al.add(tempList);

	            while(!tempStack.isEmpty()){
	                s.push(tempStack.pop());
	            }
	        }
	        return al;
	    }

}
