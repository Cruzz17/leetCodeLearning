package temp;

/*
created by cwy on2019.02.18
给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。

具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。

示例 1:

输入: "abc"
输出: 3
解释: 三个回文子串: "a", "b", "c".
示例 2:

输入: "aaa"
输出: 6
说明: 6个回文子串: "a", "a", "a", "aa", "aa", "aaa".
注意:

输入的字符串长度不会超过1000。
 */
public class Demo647 {
    public int countSubstrings(String s) {
        if (s.equals("")) {
            return 0;
        }
        int count = 0;
        char[] cs = s.toCharArray();
        int n = cs.length;
        boolean DP[][] = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            DP[i][i] = true;
        }
        count += n;
        for (int len = 1; len < n; len++) {
            for (int i = 0; i < n - len; i++) {
                int j = i + len;
                if (cs[i] != cs[j]) {
                    DP[i][j] = false;
                } else {
                    DP[i][j] = ifHuiWen(DP, i + 1, j - 1);
                    if (DP[i][j] == true) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public boolean ifHuiWen(boolean DP[][], int i, int j) {
        if (i >= j) {
            return true;
        } else {
            return DP[i][j];
        }

    }
}
