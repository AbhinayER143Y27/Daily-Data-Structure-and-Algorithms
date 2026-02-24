package linkedlist;

public class OneFourThree {
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
        public void reorderList(ListNode head) {
            // Find the middle
            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Reverse the list
            ListNode prev = null;
            ListNode curr = slow.next;

            slow.next = null;
            while(curr != null)
            {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            //Merge the first half and the reversed list

            ListNode First = head;
            ListNode Second = prev;

            while(Second != null)
            {
                ListNode temp1 = First.next;
                ListNode temp2 = Second.next;

                First.next = Second;
                Second.next = temp1;

                First = temp1;
                Second = temp2;
            }
        }
    }
}
