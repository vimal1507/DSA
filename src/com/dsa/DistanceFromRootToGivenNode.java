package com.dsa;

import java.util.Stack;

public class DistanceFromRootToGivenNode {
	
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(20);
        root.left = new TreeNode(40);
        root.right = new TreeNode(60);
        root.left.left = new TreeNode(80); 
        
        
        System.out.println(distance(root,40));
		}

	
	public static int distance(TreeNode node, int x) {
		
		if(node == null)
			return -1;
		Stack<TreeNode> st = new Stack<>();
		Stack<Integer> sd = new Stack<>();
		st.push(node);
		sd.push(1);
		while(!st.isEmpty()) {
			TreeNode currNode = st.pop();
			int temp = sd.pop();
			if(currNode.val == x) {
				return temp-1;
			}
			temp++;
			if(currNode.left != null) {
				st.push(currNode.left);
				sd.push(temp);
			}
			
			if(currNode.right != null) {
				st.push(currNode.right);
				sd.push(temp);
			}
		}
		return -1;
	}
}
