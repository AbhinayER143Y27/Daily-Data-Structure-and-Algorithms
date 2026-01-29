package linkedlist;
public class ReverseList {

    // 1. The Logic: This is what you copy to LeetCode
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode front = curr.next; // Save the next node (so we don't lose the list)
            curr.next = prev;           // Reverse the link (point backwards)
            prev = curr;                // Move 'prev' one step forward
            curr = front;               // Move 'curr' one step forward
        }
        // 'prev' is now the new Head of the reversed list
        return prev;
    }

    // ---------------------------------------------------------
    // Helper methods to run this locally in IntelliJ
    // ---------------------------------------------------------

    public static void main(String[] args) {
        ReverseList solver = new ReverseList();

        // Step 1: Create a list manually: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        // Step 2: Reverse it
        ListNode newHead = solver.reverseList(head);

        System.out.print("Reversed List: ");
        printList(newHead);
    }

    // Simple helper to print the list nicely
    private static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
