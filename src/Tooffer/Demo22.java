package Tooffer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Demo22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        Queue<ListNode> stack = new LinkedList<>();
        while (head != null) {
            stack.add(head);
            head = head.next;
        }
        while (stack.size() != k) {
            stack.poll();
        }
        ListNode result = new ListNode(0);
        ListNode temp;
        temp = result;
        for (ListNode n :
                stack) {
            temp.next =n;
            temp = n;
        }
        return result.next;
    }
}
