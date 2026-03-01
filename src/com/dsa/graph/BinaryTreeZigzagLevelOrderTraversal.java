package com.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BinaryTreeZigzagLevelOrderTraversal {

	public static void main(String[] args) {
		
		
	}
		class TreeNode {
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

			public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
				List<List<Integer>> result = new ArrayList<>();
				Queue<TreeNode> q = new LinkedList<>();
				q.offer(root);
				boolean lTr = true;
				if (root == null) {
					return result;
				}

				while (!q.isEmpty()) {
					int size = q.size();
					LinkedList<Integer> res = new LinkedList<>();
					for (int i = 0; i < size; i++) {
						TreeNode curNode = q.poll();
						if (lTr) {
							res.addLast(curNode.val);
						} else {
							res.addFirst(curNode.val);
						}

						if (curNode.left != null) {
							q.offer(curNode.left);
						}

						if (curNode.right != null) {
							q.offer(curNode.right);
						}
					}
					lTr = !lTr;
					result.add(res);
				}
				return result;
			}
		}
}
