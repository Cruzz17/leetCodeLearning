package twoPoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo438 {
    public List<Integer> findAnagrams(String s, String p) {
        int left = 0;
        int right = 0;
        int valid = 0;
        List<Integer> res = new ArrayList<>();
        Map<Character, Integer> needs = new HashMap<>();
        Map<Character, Integer> windows = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            needs.put(p.charAt(i), needs.getOrDefault(p.charAt(i), 0) + 1);
        }
        while (right < s.length()) {
            Character c = s.charAt(right);
            right++;
            if (needs.containsKey(c)) {
                windows.put(c,windows.getOrDefault(c,0)+1);
                if(windows.get(c).compareTo(needs.get(c))==0){
                    valid++;
                }
            }
            while (right-left >=p.length()) {
                if (valid == needs.size())
                    res.add(left);
                Character d = s.charAt(left);
                left++;
                if (needs.containsKey(d)) {
                    if (windows.get(d).compareTo(needs.get(d)) == 0)
                        valid--;
                    windows.put(d, windows.get(d) - 1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Demo438 demo438 = new Demo438();
        System.out.println(demo438.findAnagrams("cbaebabacd","abc"));
    }
}
