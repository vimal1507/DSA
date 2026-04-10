package com.dsa.binarysearch;

public class ConvertSortedListtoBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
	    public TreeNode sortedListToBST(ListNode head) {
	        if(head == null){
	            return null;
	        }
	        if(head.next == null){
	            return new TreeNode(head.val);
	        }

	        ListNode mid = findMid(head);

	        TreeNode root = new TreeNode(mid.val);
	        root.left = sortedListToBST(head);
	        root.right = sortedListToBST(mid.next);
	        return root;
	    }

	    private ListNode findMid(ListNode head){
	        ListNode pre = null;
	        ListNode slow = head;
	        ListNode fast = head;
	        while(fast != null && fast.next != null){
	            pre = slow;
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	        if(pre != null){
	            pre.next = null;
	        }
	        return slow;
	    }
	}

}
