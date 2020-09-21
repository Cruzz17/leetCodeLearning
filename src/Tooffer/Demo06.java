package Tooffer;

import java.util.Stack;

public class Demo06 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> temp = new Stack<>();
        while (head!=null){
            temp.push(head.val);
            head=head.next;
        }
        int[] result = new int[temp.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp.pop();
        }
        return result;
    }
}
