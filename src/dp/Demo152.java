package dp;

/**
 * [2,3,-2,4]
 */
public class Demo152 {
    public int maxProduct(int[] nums) {
        int[] dp = new int[nums.length];
        if(nums.length==1)
            return nums[0];
        dp[0] = nums[0];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = nums[i];
        }
        for (int i = 1; i < nums.length; i++) {
            if (dp[i] == 0 || dp[i - 1] == 0) {
                dp[i] = Math.max(nums[i], 0);
            } else {
                dp[i] = dp[i - 1] * dp[i];
            }
        }
        int res = -Integer.MIN_VALUE + 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] == 0) {
                    res = Math.max(res, nums[i]);
                    continue;
                }
                res = Math.max(res, Math.max(nums[i], Math.max(dp[i], dp[i] / dp[j])));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Demo152 demo152 = new Demo152();
        int[] nums = {0};
        System.out.println(demo152.maxProduct(nums));
    }
}
