package temp;

/*
created by cwy on 2018.01.20
将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。

示例：

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
 */
public class Demo21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = new ListNode(0);
        ListNode temp = p1;//这个是不断后退的指向尾部的指针，P1为头指针
        while (l1.next != null || l2.next != null) {
            if (l1.val >= l2.val) {
                ListNode p2 = new ListNode(l2.val);
                temp.next = p2;
                l2 = l2.next;
                temp = temp.next;
            } else {
                ListNode p2 = new ListNode(l1.val);
                temp.next = p2;
                l1 = l1.next;
                temp = temp.next;
            }
        }
        return p1.next;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = null;
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(2);
        ListNode b3 = new ListNode(3);
        ListNode b4 = new ListNode(4);
        ListNode b5 = new ListNode(5);
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = b5;
        b5.next = null;
        Demo21 demo21 = new Demo21();
        System.out.println(demo21.mergeTwoLists(a1, b1));

    }
}
