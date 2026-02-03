package linkedlist;

public class LinkedListCRUD {

    // --- 1. INSERTION OPERATIONS ---

    // Case A: Add to the very beginning (Head)
    public ListNode addFirst(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head; // Point new node to the old head
        return newNode;      // New node is the new head
    }

    // Case B: Add to the very end (Tail)
    public ListNode addLast(ListNode head, int val) {
        ListNode newNode = new ListNode(val);

        // Edge case: If list is empty, new node is the head
        if (head == null) {
            return newNode;
        }

        // Traverse to the last node
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        // Link the last node to the new node
        temp.next = newNode;
        return head;
    }

    // Case C: Add at a specific position (The Middle)
    // Position 0 = Head, Position 1 = Second node, etc.
    public ListNode addAtPosition(ListNode head, int val, int position) {
        if (position == 0) {
            return addFirst(head, val);
        }

        ListNode newNode = new ListNode(val);
        ListNode temp = head;

        // Traverse to the node JUST BEFORE the target position
        for (int i = 0; i < position - 1; i++) {
            if (temp == null) return head; // Position out of bounds
            temp = temp.next;
        }

        // The Swap Logic:
        // 1. New node points to the next node
        newNode.next = temp.next;
        // 2. Current node points to new node
        temp.next = newNode;

        return head;
    }

    // --- 2. DELETION OPERATIONS ---

    // Case A: Delete the first node
    public ListNode deleteFirst(ListNode head) {
        if (head == null) return null;
        return head.next; // Just move head forward, the old one is garbage collected
    }

    // Case B: Delete the last node
    public ListNode deleteLast(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode temp = head;
        // Stop at the SECOND TO LAST node (node before the tail)
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null; // Cut the link to the last node
        return head;
    }

    // Case C: Delete from a specific position (The Middle)
    public ListNode deleteAtPosition(ListNode head, int position) {
        if (position == 0) return deleteFirst(head);

        ListNode temp = head;
        // Traverse to the node JUST BEFORE the one we want to delete
        for (int i = 0; i < position - 1; i++) {
            if (temp == null || temp.next == null) return head;
            temp = temp.next;
        }

        // The Skip Logic:
        // Point current node to the node AFTER the next one
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }

    // --- 3. HELPER TO PRINT ---
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // --- 4. MAIN METHOD TO TEST IT ALL ---
    public static void main(String[] args) {
        LinkedListCRUD solver = new LinkedListCRUD();
        ListNode head = null; // Start empty

        System.out.println("--- INSERTION TESTS ---");

        // 1. Add First
        head = solver.addFirst(head, 10); // 10
        head = solver.addFirst(head, 5);  // 5 -> 10
        System.out.print("Added 5, 10 to start: ");
        printList(head);

        // 2. Add Last
        head = solver.addLast(head, 20); // 5 -> 10 -> 20
        System.out.print("Added 20 to end:      ");
        printList(head);

        // 3. Add Middle (Position 1, so between 5 and 10)
        head = solver.addAtPosition(head, 8, 1); // 5 -> 8 -> 10 -> 20
        System.out.print("Added 8 at pos 1:     ");
        printList(head);

        System.out.println("\n--- DELETION TESTS ---");

        // 4. Delete First (Delete 5)
        head = solver.deleteFirst(head); // 8 -> 10 -> 20
        System.out.print("Deleted First:        ");
        printList(head);

        // 5. Delete Last (Delete 20)
        head = solver.deleteLast(head); // 8 -> 10
        System.out.print("Deleted Last:         ");
        printList(head);

        // 6. Delete Middle (Delete 10 at index 1)
        head = solver.deleteAtPosition(head, 1); // 8
        System.out.print("Deleted pos 1:        ");
        printList(head);
    }
}