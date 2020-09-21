package temp;

/*
created by cwy on 2019.01.21
 */
public class Demo160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1=headA;
        ListNode p2=headB;
        while (p1!=null&&p2!=null){
            p1=p1.next;
            p2=p2.next;
        }
        while (p1!=null){
            headA=headA.next;
            p1=p1.next;
        }
        while (p2!=null){
            headB=headB.next;
            p2=p2.next;
        }
        while (headA!=null&&headB!=null){
            if(headA==headB)
                return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;

    }
}
