package temp;

import java.util.*;

/*
created by cwy on 2019.03.03
给定一个非空的整数数组，返回其中出现频率前 k 高的元素。

示例 1:

输入: nums = [1,1,1,2,2,3], k = 2
输出: [1,2]
示例 2:

输入: nums = [1], k = 1
输出: [1]
 */
public class Demo347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList arrayList=new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int g=map.get(nums[i]);
                map.put(nums[i],g+1);
            }
            else {
                map.put(nums[i],1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue() - o1.getValue());
        List list1=new ArrayList();
        for(Map.Entry s:list){
            list1.add(Integer.parseInt(s.getKey().toString()));
        }
//        int [] list2=list1.toArray(new int[list1.size()]);

        return list1.subList(0,k);

//        for(int i=0;i<k;i++){
//            list2.add(list1[i]);
//        }
//        return list2;
    }

    public static void main(String[] args) {
        Demo347 demo347=new Demo347();
        int []arr={1,1,1,2,2,3};
        int m=2;
        demo347.topKFrequent(arr,m);
    }
}

//    public List<Integer> topKFrequent(int[] nums, int k) {
//
//    }

