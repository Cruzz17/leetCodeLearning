package temp;

import java.util.ArrayList;
import java.util.List;

/*
leetcode763 划分字母区间
created by cwy on 2019.1.09
字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一个字母只会出现在其中的一个片段。返回一个表示每个字符串片段的长度的列表。

示例 1:

输入: S = "ababcbacadefegdehijhklij"  a 10
ababcbacadefegdehijhklij
i
        j
        记录最大的为8此方法
 i
输出: [9,7,8]
解法：从左到右，存储字符串的最后一次出现的最大位置，比如a是左边第一个和右边第9个，依次遍历b的首尾位置
解释:
划分结果为 "ababcbaca", "defegde", "hijhklij"。
每个字母最多出现在一个片段中。
像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
注意:

S的长度在[1, 500]之间。
S只包含小写字母'a'到'z'。
 */
public class Demo763 {
    public List<Integer> partitionLabels(String S) {
        int [] last = new int[26];
        for(int i = 0; i<S.length(); i++)
        {
           last[S.charAt(i)-'a'] = i;//记录出s的每个字符最后出现的位置的下标？？？last[ascii码]
        }
        List<Integer> res = new ArrayList<>();
        int maxJump = 0;
        int start = 0;
        for(int i = 0; i<S.length(); i++)
        {
        maxJump = Math.max(maxJump, last[S.charAt(i)-'a']);
        if(i == maxJump)
           {
            res.add(i-start+1);
            start = i+1;
           }
        }
        return res;
    }

    public static void main(String[] args) {
        Demo763 demo763=new Demo763();
        String s="ababcbacadefegdehijhklij";
        demo763.partitionLabels(s);
    }

}
