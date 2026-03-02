package com.dsa.graph;

public class LowestCommonAncestorofaBinaryTree {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
		
		TreeNode(){}
	}

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.right = new TreeNode(1);
		TreeNode res = lowestCommonAncestor(root,root.left,root.right);
		System.out.println(res.val);

	}

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == p || root == q)
			return root;

		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);

		if (left != null && right != null)
			return root;

		return (left == null) ? right : left;
	}
}
