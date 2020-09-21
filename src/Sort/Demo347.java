package Sort;

import java.util.*;

public class Demo347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer temp;
        for (int num : nums) {
            temp = map.getOrDefault(num, 0);
            map.put(num, temp + 1);
        }
        //小根堆排序,由低到高
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1)-map.get(o2);
            }
        });
        // 倒序维护一个大小为k的大根堆
        for (int key : map.keySet())
        {
            if (pq.size() < k)
                pq.add(key);
            else if (map.get(key) > map.get(pq.peek()))
            {
                pq.remove();
                pq.add(key);
            }
        }
        int []res= new int[pq.size()];
        int s =0;
        while (!pq.isEmpty())
        {
            res[s++]=pq.peek();
        }
        return res;
    }
}
