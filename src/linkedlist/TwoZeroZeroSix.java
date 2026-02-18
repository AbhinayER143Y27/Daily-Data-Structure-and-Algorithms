package linkedlist;
//this is the 206th question by mistake
public class TwoZeroZeroSix {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;   // This will become the new head (starts as null)
        ListNode curr = head;   // The node we are currently processing

        while (curr != null) {
            ListNode front = curr.next; // 1. Save the next node (so we don't lose the chain)
            curr.next = prev;           // 2. Point backwards! (Cut the old link)
            prev = curr;                // 3. Move 'prev' forward
            curr = front;               // 4. Move 'curr' forward
        }

        // At the end, 'prev' is sitting at the new head (the old last node)
        return prev;
    }
}
