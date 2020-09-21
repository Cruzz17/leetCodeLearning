package temp;

/*
created by cwy on 2019.01.18
反转一个单链表。

示例:

输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
进阶:
你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
public class Demo206 {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode p1= new ListNode(0);
        while (head!=null){
            ListNode temp=p1.next;
            ListNode p2=new ListNode(head.val);
            p1.next=p2;
            p2.next=temp;
            head=head.next;
        }
        return p1.next;
    }

    public static void main(String[] args) {
        ListNode a1=new ListNode(1);
        ListNode a2=new ListNode(2);
        ListNode a3=new ListNode(3);
        ListNode a4=new ListNode(4);
        ListNode a5=new ListNode(5);
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;
        a5.next=null;
        Demo206 demo206=new Demo206();
        System.out.println(demo206.reverseList(a1));
    }
}
