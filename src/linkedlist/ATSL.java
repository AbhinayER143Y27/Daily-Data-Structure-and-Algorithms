package linkedlist;

public class ATSL {

    public static void main(String args[])
    {
        ListNode head = new ListNode(1);
        ListNode tail = head;
        tail = append(tail, 2);
        tail = append(tail, 3);
        tail = append(tail, 4);
        tail = append(tail, 5);
        tail = append(tail, 6);
        System.out.println("------------ This is the original List ----------------");
        printList(head);

        System.out.println("-------------This is the edited List ------------------");
        head = Editor(head,9000);
        printList(head);
    }

    private static ListNode Editor(ListNode head,int val)
    {
        ListNode newNode = new ListNode(val);


        if(head == null)
        {
            return newNode;
        }

        ListNode temp = head;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }


    private static ListNode append(ListNode tail, int number)
    {
        tail.next = new ListNode(number);
        return tail.next;
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
