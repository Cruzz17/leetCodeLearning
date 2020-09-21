package Sort;

import java.util.*;

public class Demo451 {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                //按照value值，从大到小排序
                return o2.getValue() - o1.getValue();
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : list)
        {
            int temp = (Integer) entry.getValue();
            while (temp>0){
                stringBuilder.append(((Character) entry.getKey()).toString());
                temp--;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        Demo451 demo451 = new Demo451();
        System.out.println(demo451.frequencySort(s));
    }
}
