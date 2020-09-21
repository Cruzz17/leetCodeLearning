package dp;

public class Demo887 {
    /*dp[k][m]表示k个鸡蛋，移动m次所能确定的最多能确定多少楼层
     *只要dp[k][m]小于N，就一只循环，直到找到N
     * dp[i-1][m-1]表示这一层碎了，向下确定的楼层，dp[i][m-1]表示这一层没碎，向上确定的层数，因为这一层已经确定过了
     * 所以是m-1，再加上这一次
     */
    public int superEggDrop(int K, int N) {
        int[][] dp = new int[K+1][N+1];
        int m = 0;
        while (dp[K][m] < N) {
            m++;
            for (int i = 1; i <= K; i++) {
                dp[i][m] = dp[i - 1][m - 1] + dp[i][m - 1] + 1;
            }
        }
        return m;
    }
}
