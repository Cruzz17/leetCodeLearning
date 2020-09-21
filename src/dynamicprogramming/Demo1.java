package dynamicprogramming;

import java.util.Arrays;

public class Demo1 {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length==0)
            return 0;
        int[]dp = new int[nums.length];
        Arrays.fill(dp,1);
        for (int i = 1; i <dp.length ; i++) {
            for (int j = 0; j <i ; j++) {
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        Arrays.sort(dp);
        return dp[nums.length-1];
    }

    public static void main(String[] args) {
        int []a = {1,7,2,8,3,4,6,5};
        Demo1 demo1 = new Demo1();
        System.out.println(demo1.lengthOfLIS(a));
    }
}
