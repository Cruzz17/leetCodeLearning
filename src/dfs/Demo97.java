package dfs;


public class Demo97 {
    // 只有两个方向的dfs,题目就变成是否有一条路径等于s3
    public boolean isInterleave(String s1, String s2, String s3) {
        //遇到字符串先想dfs，然后考虑dp，dfs记得要使用备忘录
        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();
        boolean[][] dp = new boolean[l1+1][l2+1];
        if(l1 + l2 != l3) return  false;
        for (int i = 0; i < l1; i++) {
            if(s1.charAt(i) == s3.charAt(i))
                dp[i+1][0] = true;
            else break;
        }
        for (int i = 0; i < l2; i++) {
            if(s2.charAt(i) == s3.charAt(i))
                dp[0][i+1] = true;
            else break;
        }
        dp[0][0] = true;
        for (int i = 1; i < l1+1 ; i++) {
            for (int j = 1; j < l2 +1 ; j++) {
                dp[i][j] = dp[i-1][j] && (s1.charAt(i-1) == s3.charAt(i+j -1))
                        || dp[i][j-1] &&( s2.charAt(j-1) == s3.charAt(i+j -1));
            }
        }
        return dp[l1][l2];
    }

    public static void main(String[] args) {
        Demo97 demo97 = new Demo97();
        System.out.println(demo97.isInterleave("db","b","cbb"));
    }
}
