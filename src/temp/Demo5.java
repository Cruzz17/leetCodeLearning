package temp;

/*
created by cwy on 2019.02.01
给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

示例 1：

输入: "babad"
输出: "bab"
注意: "aba" 也是一个有效答案。
示例 2：

输入: "cbbd"
输出: "bb"
 */
public class Demo5 {
    public String longestPalindrome(String s) {
        int len=s.length();
        if(len <= 0)
            return s;
        int max=0;
        String temp=null;
        boolean[][] dp = new boolean[len][len];
        for(int i=len-1;i>=0;i--){
            for(int j=i;j<len;j++){
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
                //先推出递归公式，首先要求们排出回文长度是1或者2的情况，则必须要求j-i<3
                //（1前遍历到的子串i~j是否是回文子串取决于i+1~j-1
                // 也就是i~j中间的子串是否是回文并且s[i]是否等于s[j]；（2）dp[i][j]是为true则意味着i~j是回文子串，
                // 则在下面判断后对res进行更新；如果为false，则该子串不是回文子串，开始遍历下一个子串。

                if(dp[i][j] && (temp == null || j - i + 1 > max)){//如果该子串长度更长，则更新temp
                    temp = s.substring(i, j+1);
                    max = temp.length();
                }

            }
        }
        return temp;}

    public static void main(String[] args) {
        Demo5 demo5=new Demo5();
        String s="ababc";
        System.out.println(demo5.longestPalindrome(s));
    }
}
