package linkedlist.ToPtactise;

import linkedlist.ListNode;

public class PalindromeList {

    public boolean isPalindrome(ListNode head) {
        // Step 1: Find the Middle (Your code!)
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the Second Half
        // 'slow' is currently at the middle. We reverse everything after it.
        ListNode secondHalfHead = reverse(slow);
        ListNode firstHalfHead = head;

        // Step 3: Compare both halves
        ListNode p1 = firstHalfHead;
        ListNode p2 = secondHalfHead;

        while (p2 != null) {
            if (p1.val != p2.val) {
                return false; // Mismatch found!
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true; // If we finish the loop, it's a palindrome.
    }

    // --- Helper: Reverse Logic (You already know this) ---
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    // --- Tester ---
    public static void main(String[] args) {
        PalindromeList solver = new PalindromeList();

        // Test 1: 1 -> 2 -> 2 -> 1 (True)
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println("Is 1->2->2->1 a palindrome? " + solver.isPalindrome(head));

        // Test 2: 1 -> 2 -> 3 (False)
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);

        System.out.println("Is 1->2->3 a palindrome?    " + solver.isPalindrome(head2));
    }
}