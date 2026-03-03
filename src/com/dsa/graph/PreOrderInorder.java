package com.dsa.graph;

import java.util.HashMap;
import java.util.Map;

public class PreOrderInorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

	  public class TreeNode {
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
	    Map<Integer,Integer> map;
	    int preorderIndex;
	    public TreeNode buildTree(int[] preorder, int[] inorder) {
	        map = new HashMap<>();
	        for(int i=0; i<inorder.length;i++){
	            map.put(inorder[i],i);
	        }

	        preorderIndex = 0;

	        return build(preorder,0,inorder.length-1);
	        
	    }

	    public TreeNode build(int[] preorder, int s, int e){
	        if(s>e)
	        return null;
	        int curVal = preorder[preorderIndex++]; 
	        TreeNode root = new TreeNode(curVal);
	        int index = map.get(curVal);
	        root.left = build(preorder,s,index-1);
	        root.right = build(preorder,index+1,e);

	        return root;
	    }
	}

}
