package dynamicprogramming;

import java.util.Arrays;

public class Demo2_Coin {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length+1][amount+1];
        for (int i = 0; i <coins.length ; i++) {
            for (int j = 0; j < amount; j++) {
                dp[i][j]=0;
            }
        }
        for (int i = 1; i < coins.length+1; i++) {
            for (int j = 1; j <amount+1 ; j++) {
                if(j>coins[i-1])
                    dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[coins.length][amount];
    }
}
