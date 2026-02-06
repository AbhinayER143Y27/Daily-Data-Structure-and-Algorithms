package linkedlist;

public class ATSF{

    public ListNode addFirst(ListNode head,int val)
    {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        return newNode;
    }
    public static void main(String[] args)
    {
        ATSF solver = new ATSF();
        ListNode head = new ListNode(2);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);

        System.out.println("Original: ");
        printlist(head);

        System.out.println("Edited One :");
        head = solver.addFirst(head,1);
        printlist(head);
    }

    private static void printlist(ListNode head)
    {
        ListNode temp = head;
        while(temp != null)
        {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
