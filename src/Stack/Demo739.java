package Stack;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 维护一个单调大的栈
 */
public class Demo739 {
    public int[] dailyTemperatures(int[] T) {
        int [] res = new int[T.length];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < T.length ; i++) {
            while (!stack.isEmpty() && T[i]> T[stack.peek()]){
                int temp = stack.pop();
                res[temp] = i -temp;
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int [] nums = {73, 74, 75, 71, 69, 72, 76, 73};
        Demo739 demo739 = new Demo739();
        int [] res = demo739.dailyTemperatures(nums);
        System.out.println(res.toString());
    }
}
