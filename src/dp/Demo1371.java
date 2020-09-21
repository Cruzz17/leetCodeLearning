package dp;

import java.util.HashMap;

public class Demo1371 {

    public int findTheLongestSubstring(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        HashMap<Integer, Integer> stateMap = new HashMap<Integer, Integer>();
        hashMap.put('a', 1);
        hashMap.put('i', 2);
        hashMap.put('u', 4);
        hashMap.put('e', 8);
        hashMap.put('o', 16);
        int res = 0;
        int max = 0;
        stateMap.putIfAbsent(0, -1);
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                res ^= hashMap.get(s.charAt(i));
            }
            if (stateMap.containsKey(res)) max = Math.max(max, i - stateMap.get(res));
            stateMap.putIfAbsent(res, i);
        }
        return max;
    }
}
