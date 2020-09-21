package everyDay;

import java.util.HashMap;
import java.util.Map;

public class Demo14 {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();
        putInMap(chars, map);
        int count = 0;
        for (String s: words) {
            Map<Character,Integer> temp = new HashMap<>();
            putInMap(s, temp);
            boolean flag =true;
            for(Map.Entry<Character,Integer> entry:temp.entrySet()){
                Character key = entry.getKey();
                Integer value = entry.getValue();
                if(map.containsKey(key)&&map.get(key)>=value){
                    continue;
                }
                else
                    flag=false;
            }
            if (flag)
                count+=s.length();
        }
        return count;
    }

    private void putInMap(String s, Map<Character, Integer> temp) {
        for (int i = 0; i < s.length() ; i++) {
            if(!temp.containsKey(s.charAt(i))){
                temp.put(s.charAt(i),1);
            }else {
                int t = temp.get(s.charAt(i));
                temp.replace(s.charAt(i), t+1);
            }
        }
    }

    public static void main(String[] args) {
        String [] strings = {"cat","bt","hat","tree"};
        Demo14 demo14 = new Demo14();
        System.out.println(demo14.countCharacters(strings, "atach"));
    }

}
