package dp;

import java.util.Arrays;

public class Demo1 {
    public int longArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int[] dp = new int[nums.length];
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        else {
            dp[0]=nums[0];
            dp[1]=Math.max(nums[0],nums[1]);
            for (int i = 2; i < nums.length; i++) {
                dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            }
            Arrays.sort(dp);
            return dp[nums.length-1];
        }
    }

    public static void main(String[] args) {
        Demo1 demo1=new Demo1();
        int[] nums ={2,1,1,2};
        System.out.println(demo1.longArray(nums));
    }

}
