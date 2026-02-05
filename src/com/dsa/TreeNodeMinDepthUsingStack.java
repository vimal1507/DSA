package com.dsa;

import java.util.Stack;


public class TreeNodeMinDepthUsingStack {

	public static void main(String[] args) {
		

	}

}


// * Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    public int minDepth(TreeNode root) {
        
        if (root == null){
             return 0;
        }
           
        Stack<TreeNode> st = new Stack<>();
        Stack<Integer> sd = new Stack<>();
        st.push(root);
        sd.push(1);
        int min_depth = Integer.MAX_VALUE;
        while(!st.isEmpty()){
            TreeNode currNode = st.pop();
            int currDepth = sd.pop();
            if(currNode.left == null && currNode.right == null){
                min_depth = Math.min(min_depth,currDepth);
            }

            if(currNode.left != null){
                st.push(currNode.left);
                sd.push(currDepth+1);
            }

            if(currNode.right != null){
                st.push(currNode.right);
                sd.push(currDepth+1);
            }
        } 
        return min_depth;
    }
}
