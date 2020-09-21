package twoPoint;

public class Demo5 {
    public String longestPalindrome(String s) {
        if (s.length() <= 0)
            return s;
        String res = "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (dp[i + 1][j - 1] || j - i < 2);
                if (dp[i][j] && j - i + 1 > res.length())
                    res= s.substring(i,j+1);

            }
        }
        return res;
    }
    public String longestPalindrome2(String s) {

        String res = "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1]); //j - i 代表长度减去 1
                if (dp[i][j] &&  j - i + 1 > res.length()) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }

}
