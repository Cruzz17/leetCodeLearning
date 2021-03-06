package temp;

/*
created by cwy on 2019.01.18
反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。

说明:
1 ≤ m ≤ n ≤ 链表长度。

示例:

输入: 1->2->3->4->5->NULL, m = 2, n = 4
输出: 1->4->3->2->5->NULL
 */
public class Demo92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null||head.next==null)
            return head;
        ListNode Nhead = new ListNode(0);
        Nhead.next = head;
        // 最终为 m 位置的前一点
        ListNode p1 = Nhead;
        // 最终为 n 位置的后一点
        ListNode nNext;
        // 待反转的两点
        ListNode cur;
        ListNode next;
        for (int i = 0; i < m - 1; i++) {
            p1 = p1.next;
        }
        cur = p1.next;
        next = cur.next;
        nNext = next;
        for (int i = 0; i < n - m; i++) {
            // 进行反转
            nNext = next.next;
            next.next = cur;
            // 移动到下一个反转处
            cur = next;
            next = nNext;
        }
        // 反转完毕，需要将两端与 mPre 和 nNext 连接
        p1.next.next = nNext;
        p1.next = cur;
        return Nhead.next;
    }

}
