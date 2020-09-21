package temp;

/*
created by cwy on 01.23
链表的归并排序
示例 1:

输入: 4->2->1->3
输出: 1->2->3->4

0   4
0-4   2
0 - 2--4 1
示例 2:

输入: -1->5->3->4->0
输出: -1->0->3->4->5
 */
public class Demo148 {
    public ListNode sortList(ListNode head) {
        //首先取中点，快慢指针，一个一次一步，一个一次两步
        if(head==null||head.next==null)
            return head;
        ListNode pre=null;
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null){
            pre=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        pre.next=null;//到中点过后截取;
        return merge(sortList(head),sortList(slow));
    }
    public ListNode merge(ListNode p1,ListNode p2){
        ListNode l1=new ListNode(0);
        ListNode l2=l1;
        while (p1!=null&&p2!=null){
            if(p1.val<p2.val){
                l2.next=p1;
                p1=p1.next;
            }else {
                l2.next=p2;
                p2=p2.next;
            }
            l2=l2.next;
        }
        if(p1!=null)
            l2.next=p1;
        if(p2!=null)
            l2.next=p2;
        return l1.next;
    }
}
