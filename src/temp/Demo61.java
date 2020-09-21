package temp;

/*
created by cwy on 2019.01.15
给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。

示例 1:

输入: 1->2->3->4->5->NULL, k = 2
     5  1  2  3  4 5 null
输出: 4->5->1->2->3->NULL
解释:
向右旋转 1 步: 5->1->2->3->4->NULL
向右旋转 2 步: 4->5->1->2->3->NULL
示例 2:将链表成环，再断链
输入: 0->1->2->NULL, k = 4
输出: 2->0->1->NULL
解释:
向右旋转 1 步: 2->0->1->NULL
向右旋转 2 步: 1->2->0->NULL
向右旋转 3 步: 0->1->2->NULL
向右旋转 4 步: 2->0->1->NULL
 */
public class Demo61 {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode pList=head;
        int len=1;
        while (pList.next!=null){
            pList=pList.next;
            len++;
        }
        pList.next=head;
        int n=len-k%len;
        ListNode rplist=pList;
        for(int i=0;i<n;i++){
            rplist=rplist.next;
        }
        ListNode result=rplist.next;
        rplist.next=null;
        return result;
    }

}
