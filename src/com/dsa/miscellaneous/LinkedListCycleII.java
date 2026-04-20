package com.dsa.miscellaneous;

public class LinkedListCycleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


 // Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

 class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                flag = true;
                break;
            }
        }
        if(!flag){
            return null;
        }

        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
       
        return fast;
    }
}
 
 
 /*
 	

 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }

public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> s = new HashSet<>();
        ListNode temp = head;
    
        while(temp != null){
            if(s.contains(temp)){
                return temp;
            }
            s.add(temp);
            temp = temp.next;
        }
        return null;
    }
}
 */