package temp;

public class Demo25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = new ListNode(0);
        ListNode cur = head;
        ListNode dummpy = temp;
        while(cur != null){
            dummpy.next = reverseK(cur, k);// 进行翻转
            cur = skipK(cur, k); // 跳跃k步
            dummpy = skipK(dummpy, k);
        }
        return temp.next;
    }
    public ListNode skipK(ListNode head, int k){
        for(int i = 0; i < k; i++){
            if(head == null){
                return null;
            }
            head = head.next;
        }
        return head;
    }
    public ListNode reverseK(ListNode head, int k){
        ListNode temp = head;
        // 利用头插法来创造新的临时链表
        ListNode res = null;
        while( k > 0){
            if(temp == null){
                return head;
            }
            ListNode cur = new ListNode(temp.val);
            cur.next = res;
            res = cur;
            k--;
            temp = temp.next;
        }
        //此处是将反转的2-1和temp 3-4-5链接起来，然后返回res
        if(k==0){
            ListNode cur = res;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = temp;
        }
        return res;
    }



    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next =l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        Demo25 de = new Demo25();
        de.reverseKGroup(l1,3);

    }
}
