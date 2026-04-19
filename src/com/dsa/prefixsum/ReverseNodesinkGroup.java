package com.dsa.prefixsum;

public class ReverseNodesinkGroup {

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
	
	    public ListNode reverseKGroup(ListNode head, int k) {
	        ListNode node = head;
	        for(int i=0; i<k; i++){
	            if(node == null){
	                return head;
	            }
	            node = node.next;
	        }

	        ListNode pre = null;
	        ListNode cur = head;
	        ListNode next = null;

	        for(int i=0; i<k; i++){
	            next = cur.next;
	            cur.next = pre;
	            pre = cur;
	            cur = next;
	        }
	        head.next = reverseKGroup(cur,k);
	        return pre;
	    }

}
