package linkedlist;

import static linkedlist.DATM.*;

public class DATL {
    public static void main (String args[])
    {
        ListNode head = new ListNode(10);
        ListNode tail = head;
        tail = addon(tail, 20);
        tail = addon(tail, 30);
        tail = addon(tail, 40);
        tail = addon(tail, 50);
        tail = addon(tail, 60);
        tail = addon(tail, 70);

        System.out.println("-------------Original List ------------------");
        printList(head);

        System.out.println("--------------The mid deletor----------------");
        head = deletelast(head);
        printList(head);
    }

    private static ListNode deletelast(ListNode head)
    {
        if(head == null) return null;
        if(head.next == null)
        {
            return null;
        }
        ListNode temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

}
