package Revision;

import linkedlist.ListNode;

public class EightSevenSIx {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next != null) //what will happen if there was or instead of and in here.
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }
}
