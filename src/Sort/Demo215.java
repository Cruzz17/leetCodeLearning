package Sort;

import java.util.PriorityQueue;

public class Demo215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num:nums) {
            queue.add(num);
            if (queue.size() > k)  // 维护堆的大小为 K
                queue.poll();
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        Demo215 demo215 = new Demo215();
        int [] nums = {3,2,1,5,6,4};
        System.out.println(demo215.findKthLargest(nums,2));
    }
}
