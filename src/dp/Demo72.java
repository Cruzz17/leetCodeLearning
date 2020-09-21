package dp;

public class Demo72 {
    // 找出两个字符串的最长子串，剩下的全部替换
    // dp[i][j]表示word1的前i个字母转换成word2的前j个字母所使用的最少操作。
    public int minDistance(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
        int [][] dp = new int[len1+1][len2+1];
        for (int i = 0; i < len1+1; i++) {
            dp[i][0]=i;
        }
        for (int i = 0; i < len2+1; i++) {
            dp[0][i]=i;
        }
        for (int i = 1; i < word1.length(); i++) {
            for (int j = 1; j < word2.length(); j++) {
                if(word1.charAt(i)==word2.charAt(j))
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
            }
        }
        return dp[len1][len2];
    }
}
