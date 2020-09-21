package dp;

import java.util.HashMap;
import java.util.Map;
/*
和为k的最长子数组
 */
public class Demo3 {
    public  int maxLength(int[] arr, int k) {
        if(arr==null||arr.length==0)
            return 0;
        int sum=0;
        int res=0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                res=Math.max(i-map.get(sum-k),res);
            }
            if(!map.containsKey(sum))
                map.put(sum,i);
        }
        return res;
    }

    public static void main(String[] args) {
        Demo3 demo3=new Demo3();
        int[]nums={1,-1,5,-2,3};
        System.out.println(demo3.maxLength(nums,3));
    }
}
