package temp;

import java.util.Arrays;

/*
created by cwy on 01.23
示例 1:
0,1,1,2,2
0,0,1,2,2

输入: [2,2,1]
输出: 1
示例 2:

输入: [4,1,2,1,2]
输出: 4
 */
public class Demo136 {
    public int singleNumber(int[] nums) {
        if(nums==null)
            return 0;
        Arrays.sort(nums);
        int i=0;
        while (i<nums.length){
            if(nums[i]==nums[i+1])
                i=i+2;
            else
                return nums[i];
        }
        return nums[nums.length-1];
    }
}
