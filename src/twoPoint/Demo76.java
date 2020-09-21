package twoPoint;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 76. 最小覆盖子串
 * 给你一个字符串 S、一个字符串 T，请在字符串 S 里面找出：包含 T 所有字符的最小子串。
 *
 * 示例：
 *
 * 输入: S = "ADOBECODEBANC", T = "ABC"
 * 输出: "BANC"
 */

public class Demo76 {
    public String minWindow(String s, String t) {
        int left =0;
        int right =0;
        int valid =0;
        int start =0;
        int len =Integer.MAX_VALUE;
        Map<Character, Integer> needs = new HashMap<>();
        Map<Character, Integer> windows = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            needs.put(t.charAt(i),needs.getOrDefault(t.charAt(i),0)+1);
        }
        // 先滑动右窗口
        while (right<s.length()){
            Character c = s.charAt(right);
            right++;
            if(needs.containsKey(c)){
                windows.put(c,windows.getOrDefault(c,0)+1);
                if(windows.get(c).compareTo(needs.get(c))==0)
                    valid++;
            }
            // 如果长度刚好等于子串并且长度小于之前的len，进行移动窗口，并更新窗口值
            while (valid==needs.size()){
                if(right-left<len){
                    start=left;
                    len = right-left;
                }
                // 判断左窗口
                Character d = s.charAt(left);
                left++;
                if(needs.containsKey(d)){
                    if(needs.get(d).compareTo(windows.get(d))==0)
                        valid--;
                    windows.put(d,windows.get(d)-1);
                }
            }
        }
        return len == Integer.MAX_VALUE ? "":s.substring(start,start+len);
    }

    public static void main(String[] args) {
        Demo76 demo76 = new Demo76();
        System.out.println(demo76.minWindow("ADOBECODEBANC","ABC"));
    }
}
