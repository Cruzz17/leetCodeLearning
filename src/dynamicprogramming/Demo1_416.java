package dynamicprogramming;

import java.util.Arrays;

public class Demo1_416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i:nums) {
            sum+=i;
        }
        if(sum%2==1)
            return false;
        int w = sum/2;
        boolean [][]dp = new boolean[nums.length][w+1];
        for (int i = 0; i <nums.length ; i++) {
            dp[i][0]=true;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < w+1; j++) {
                if(j>=nums[i]){
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-nums[i]];
                }
            }
        }
        return dp[nums.length-1][w];
    }
}
