package dp;

public class Demo494 {
    public int findTargetSumWays(int[] nums, int S) {
        if(nums.length == 0)
            return 0;
        if(nums.length==1)
            if(Math.abs(S)==nums[0])
                return 1;
            else
                return 0;
        int sum = computeArraySum(nums);
        if (sum < S || (sum + S) % 2 == 1) {
            return 0;
        }
        int W = (sum + S) / 2;
        int[][] dp = new int[nums.length][W+1];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0)
                dp[i][0]=2;
            else
                dp[i][0]=1;

        }
        for (int i = 1; i <W+1 ; i++) {
            if(nums[0]==i)
                dp[0][i]=1;
            else
                dp[0][i]=0;
        }
        for (int i = 1; i <nums.length ; i++) {
            for (int j = 0; j < W+1; j++) {
                if(j>=nums[i])
                    dp[i][j]= dp[i-1][j]+dp[i-1][j-nums[i]];
            }
        }
        return dp[nums.length-1][W];
    }

    private int computeArraySum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public int findTargetSumWays2(int[] nums, int S) {
        if(nums == null)
            return 0;
        int sum = 0;
        for(int num : nums)
            sum += num;
        if(S > sum || (sum + S)%2 == 1)
            return 0;
        sum = (sum + S)/2;
        int[] dp = new int[sum+1];
        dp[0] = 1;
        for(int i = 0; i < nums.length; i++){
            for(int j = sum; j >= nums[i]; j--){
                dp[j] += dp[j-nums[i]];
            }
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        Demo494 demo494 = new Demo494();
        int[] nums = {0,0,0,0,0,0,0,0,1};
        int target = 1;
        System.out.println(demo494.findTargetSumWays(nums,target));
    }
}
