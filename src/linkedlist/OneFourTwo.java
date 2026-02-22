package linkedlist;

public class OneFourTwo {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            boolean hasLoop = false;

            while(fast != null && fast.next != null)
            {
                fast = fast.next.next;
                slow = slow.next;

                if(slow == fast)
                {
                    hasLoop = true;
                    break;
                }
            }

            if(! hasLoop)
            {
                return null;
            }

            slow = head;

            while(slow != fast)
            {
                slow = slow.next;
                fast = fast.next;
            }

            return slow;
        }
    }
}
