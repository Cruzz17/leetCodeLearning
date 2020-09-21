package silingwindows;

public class Demo3 {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        int res = 0;
        while (l <= r && l < s.length() && r < s.length()) {
            if (s.substring(l, r).contains(String.valueOf(s.charAt(r)))) {
                l++;
                continue;
            } else {
                r++;
            }
            res = Math.max(res, r - l);
        }
        return res;
    }

    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        String s = "pwwkew";
        System.out.println(demo3.lengthOfLongestSubstring(s));
    }
}
