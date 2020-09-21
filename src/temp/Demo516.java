package temp;

public class Demo516 {
    public int longestPalindromeSubseq(String s) {
        int n =s.length();
        if(s.length()==0)
            return 0;
        int[][] dp = new int[s.length()][s.length()];
        for (int i = n-1; i >= 0 ; i--) {
            dp[i][i] = 1;
            for (int j = i+1; j <  s.length(); j++) {
                if(s.charAt(i)==s.charAt(j))
                    dp[i][j] = dp[i+1][j-1]+2;
                else
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);

            }
        }
        return dp[0][n-1];
    }
}
