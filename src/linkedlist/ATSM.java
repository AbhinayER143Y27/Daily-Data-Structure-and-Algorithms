package linkedlist;

import java.util.List;

public class ATSM {
    public ListNode addAtPosition(ListNode head, int val, int position)
    {
        if(position == 0)
        {
            ListNode current = new ListNode(val);
            current.next = head;
            return current;
        }
        ListNode temp = head;
        for(int i = 0; i < position - 1; i++)
        {
            temp = temp.next;
        }
        ListNode InsertedNode = new ListNode(val);

        InsertedNode.next = temp.next;
        temp.next = InsertedNode;

        return head;
    }

    public static void main(String args[])
    {
        ATSM AXX = new ATSM();
        ListNode head = new ListNode(1);
        ListNode current = head;
        for(int i = 2; i <= 9; i++)
        {
            current.next = new ListNode(i);
            current = current.next;
        }

        System.out.println("The Original List : ");
        printList(head);

        System.out.println("The added value: ");
        AXX.addAtPosition(head, 1000, 6);
        printList(head);
    }

    private static void printList(ListNode head)
    {
        ListNode current = head;
        while(current != null)
        {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }
}
