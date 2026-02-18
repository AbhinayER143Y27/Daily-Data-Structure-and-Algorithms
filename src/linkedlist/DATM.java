package linkedlist;

import java.util.List;

public class DATM {
    public static void main (String args[])
    {
        ListNode head = new ListNode(1);
        ListNode tail = head;
        tail = addon(tail, 2);
        tail = addon(tail, 3);
        tail = addon(tail, 4);
        tail = addon(tail, 5);
        tail = addon(tail, 6);
        tail = addon(tail, 7);

        System.out.println("-------------Original List ------------------");
        printList(head);

        System.out.println("--------------The mid deletor----------------");
        head = deletemid(head,4);
        printList(head);
    }

    private static ListNode deletemid(ListNode head, int position)
    {
        if(head == null)
        {
            return null;
        }
        if(position == 0)
        {
            return head.next;
        }
        ListNode temp = head;

        for(int i = 0; i < position - 1; i++)
        {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;

    }

     static void printList(ListNode head)
    {
        ListNode temp = head;
        while(temp != null)
        {
            System.out.print(temp.val + " - > ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    static ListNode addon(ListNode head, int value)
    {
        ListNode newNode = new ListNode(value);

        ListNode temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

}
