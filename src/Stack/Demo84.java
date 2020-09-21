package Stack;

import java.util.Deque;
import java.util.LinkedList;

public class Demo84 {
    public int largestRectangleArea(int[] heights) {
        int [] temp = new int[heights.length+2];
        System.arraycopy(heights,0,temp,1,heights.length);
        Deque<Integer> stack = new LinkedList<>();
        int area = 0;
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                int tmp = stack.pop();
                area = Math.max(area, heights[tmp] * (i-tmp));
            }
            stack.push(i);
        }
        return area;
    }
}
