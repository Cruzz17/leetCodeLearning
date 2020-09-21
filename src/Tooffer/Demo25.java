package Tooffer;

public class Demo25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                ListNode temp = new ListNode(l1.val);
                head.next = temp;
                l1 = l1.next;
                head = head.next;
            } else {
                ListNode temp = new ListNode(l2.val);
                head.next = temp;
                l2 = l2.next;
                head = head.next;
            }
        }
        if(l1!=null)
            head.next=l1;
        if(l2!=null)
            head.next=l2;
        return result.next;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;
        a3.next = null;
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);
        b1.next = b2;
        b2.next = b3;
        b3.next = null;
        Demo25 demo25 = new Demo25();
        System.out.println(demo25.mergeTwoLists(a1, b1));
    }
}
