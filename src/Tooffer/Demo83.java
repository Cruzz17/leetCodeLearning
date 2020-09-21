package Tooffer;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Demo83 {
    public ListNode deleteNode(ListNode head){
        ListNode temp = head;
        while (temp!=null){
            if(temp.next != null && temp.next.val == temp.val){
                ListNode cur = temp.next.next;
                temp.next = cur;
                temp = cur;
            }else {
                temp= temp.next;
            }
        }
        return head;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(Arrays.asList(lists));
        ListNode res = new ListNode(0);
        while(!queue.isEmpty()){
            ListNode temp = queue.poll();
            res.next = new ListNode(temp.val);
            res=res.next;
            if(temp.next!=null){
                queue.add(temp.next);}
        }
        return res;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        l1.next =l2;
        l2.next = l3;
        Demo83 demo83 = new Demo83();
        demo83.deleteNode(l1);
    }
}
