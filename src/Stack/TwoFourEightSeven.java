package Stack;

import linkedlist.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class TwoFourEightSeven {
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
        public ListNode removeNodes(ListNode head) {
            if(head == null || head.next == null)return head;

            Deque<ListNode> stack = new ArrayDeque<>();
            ListNode fakeHead = head;
            while(fakeHead != null)
            {
                while(!stack.isEmpty() && stack.peek().val < fakeHead.val)
                {
                    stack.pop();
                }
                stack.push(fakeHead);
                fakeHead = fakeHead.next;
            }
            //ArrayDeque iterator iteratos from the top to bottom but we have to do from the bottom to top as to preserver the sequence.
            ListNode dummy = new ListNode(0);
            ListNode navigator = dummy;
            Iterator<ListNode> it = stack.descendingIterator();
            while(it.hasNext())
            {
                ListNode validNode = it.next();
                navigator.next = validNode;
                navigator = navigator.next;
            }
            if(navigator != null)
            {
                navigator.next = null;
            }
            return dummy.next;
        }
    }
}
