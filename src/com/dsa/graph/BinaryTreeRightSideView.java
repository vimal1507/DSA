package com.dsa.graph;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		
		List<Integer> result = rightSideView(root);
		System.out.println(result);

	}

	public static List<Integer> rightSideView(TreeNode root) {
		ArrayList<Integer> al = new ArrayList<>();
		int level = 0;
		calRight(root, al, level);
		return al;
	}

	private static void calRight(TreeNode root, ArrayList<Integer> al, int level) {

		if (root == null) {
			return;
		}
		if (level == al.size())
			al.add(root.val);

		calRight(root.right, al, level + 1);
		calRight(root.left, al, level + 1);
	}
}
