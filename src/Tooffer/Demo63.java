package Tooffer;

public class Demo63 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int l = prices.length;
        int[][] dp = new int[l][2];
        dp[0][0] = 0;
        dp[0][1] = - prices[0];
        for (int i = 1; i < l; i++) {
            dp[i][0]=Math.max(dp[i-1][0],prices[i]+dp[i-1][1]);
            dp[i][1]=Math.max(dp[i-1][1],0-prices[i]);
        }
        return dp[l-1][0];
    }

    public static void main(String[] args) {
        int[] a = {7, 1, 5, 3, 6, 4};
        Demo63 demo63 = new Demo63();
        System.out.println(demo63.maxProfit(a));
    }
}
