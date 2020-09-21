package temp;

import java.util.Stack;

public class Demo445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode head = null;
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry > 0) {
            int sum = carry;
            sum += stack1.isEmpty()? 0: stack1.pop();
            sum += stack2.isEmpty()? 0: stack2.pop();
            ListNode node = new ListNode(sum % 10);
            node.next = head;
            head = node;
            carry = sum / 10;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode a1=new ListNode(7);
        ListNode a2=new ListNode(2);
        ListNode a3=new ListNode(4);
        ListNode a4=new ListNode(3);
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=null;

        ListNode b1=new ListNode(5);
        ListNode b2=new ListNode(6);
        ListNode b3=new ListNode(4);
        b1.next=b2;
        b2.next=b3;
        b3.next=null;
        Demo445 demo445 = new Demo445();
        demo445.addTwoNumbers(a1,b1);
    }
}
