package com.dsa;

import java.util.Stack;

public class SecondMinNodeUssingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int findSecondMinimumValue(TreeNode root) {
        if(root == null || root.left == null || root.right == null)
            return -1;
        Stack<TreeNode> sn = new Stack<>();
        sn.push(root);
        int minVal = root.val;
        int secMinVal = -1;
        while(!sn.isEmpty()){
            TreeNode currNode = sn.pop();
            int currVal = currNode.val;

            if(minVal > currVal){
                minVal = currVal;
            }

            if((secMinVal > currVal || secMinVal == -1) && currVal > minVal){
                secMinVal = currVal;
            }

            if(currNode.left != null){
                sn.push(currNode.left);
            }

            if(currNode.right != null){
                sn.push(currNode.right);
            }
        }
        return secMinVal;
    }
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

    
