package temp;

import java.util.ArrayList;
import java.util.List;

public class Demo234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head!=null)
        {
            list.add(head.val);
            head=head.next;
        }
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)!=list.get(list.size()-i-1))
                return false;
        }
        return true;
    }

}
