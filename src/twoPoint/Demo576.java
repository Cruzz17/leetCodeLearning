package twoPoint;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的排列。
 *
 * 换句话说，第一个字符串的排列之一是第二个字符串的子串。
 *
 * 示例1:
 *
 * 输入: s1 = "ab" s2 = "eidbaooo"
 * 输出: True
 * 解释: s2 包含 s1 的排列之一 ("ba").
 *  
 *
 * 示例2:
 *
 * 输入: s1= "ab" s2 = "eidboaoo"
 * 输出: False
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutation-in-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Demo576 {
    public boolean checkInclusion(String s1, String s2) {
        int left=0,right=0,valid = 0;
        Map<Character,Integer> needs = new HashMap<>();
        Map<Character, Integer> windows = new HashMap<>();
        for (int i = 0; i <s1.length() ; i++) {
            needs.put(s1.charAt(i),needs.getOrDefault(s1.charAt(i),0)+1);
        }
        while (right<s2.length()){
            // 先移动右窗口，如果当前字符在needs这个map里，那么就将其放入窗口内，如果放完后窗口的值相等
            // 就将有效长度+1
            Character c = s2.charAt(right);
            right++;
            if(needs.containsKey(c)){
                windows.put(c,windows.getOrDefault(c,0)+1);
                if(windows.get(c).compareTo(needs.get(c))==0){
                    valid++;
                }
            }
            // 判断左窗口是否需要移动，将窗口的长度维持为子串的长度
            while (right-left >=s1.length()){
                if(needs.size()==valid)
                    return true;
                //删除多余的长度
                Character d = s2.charAt(left);
                left++;
                if(needs.containsKey(d)){
                    if(needs.get(d).compareTo(windows.get(d))==0)
                        windows.put(d,windows.get(d)-1);
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Demo576 demo576 = new Demo576();
        String s1 = "ab";
        String s2 = "eibacdooooo";
        System.out.println(demo576.checkInclusion(s1,s2));
    }
}
