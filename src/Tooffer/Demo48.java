package Tooffer;

/**
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo48 {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0)
            return 0;
        if(s.length()==1 ){
            return 1;
        }
        int result = 0;
        int left =0;
        int right = 0;
        while (left<=right && right<s.length()){
            if(judgeContain(s, left, right, s.charAt(right))){
                left++;
            }else {
                result=Math.max(right- left+1, result);
                right++;
            }
        }
        return result;

    }

    public boolean judgeContain(String s, int left, int right, char target) {
        if (s.substring(left, right).contains(String.valueOf(target))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Demo48 demo48 = new Demo48();
        System.out.println(demo48.lengthOfLongestSubstring("abcdedghab"));
    }
}
