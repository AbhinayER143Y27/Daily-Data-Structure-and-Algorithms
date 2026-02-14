package linkedlist;

public class DATSF {

    public static void main (String args[])
    {
        ListNode head = new ListNode(1);
        ListNode tail = AddOn(head, 2);
        tail = AddOn(tail, 3);
        tail = AddOn(tail, 4);
        tail = AddOn(tail, 5);

        System.out.println("-----------This is the Original ListNode ----------------");
        printList(head);

        System.out.println("------------This is the Deleted Node List ----------------");
        head = deleteOne(head);
        head = deleteOne(head);
        printList(head);
    }

    private static ListNode deleteOne(ListNode head)
    {
        if(head == null)
        {
            return null;
        }

        ListNode newHead = head.next;

        return newHead;
    }

    private static ListNode AddOn(ListNode head, int value)
    {
        ListNode newNode = new ListNode(value);
        ListNode temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    private static void printList(ListNode head)
    {
        ListNode temp = head;
        while(temp != null)
        {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
