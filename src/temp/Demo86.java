package temp;

/*
created by cwy on 2019.01.14 86
给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。

你应当保留两个分区中每个节点的初始相对位置。

示例:

输入: head = 1->4->3->2->5->2, x = 3
输出: 1->2->2->4->3->5
 */
public class Demo86 {
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null)
            return head;
        ListNode h1=new ListNode(0);
        ListNode p1=h1;
        ListNode h2=new ListNode(0);
        ListNode p2=h2;
        ListNode plist=head;
        while (plist!=null){
            if(plist.val<x){
                h1.next=plist;
                h1=h1.next;
            }else {
                h2.next=plist;
                h2=h2.next;
            }
            plist=plist.next;
        }
        h1.next=p2.next;
        h2.next=null;
        return p1.next;
    }
}
