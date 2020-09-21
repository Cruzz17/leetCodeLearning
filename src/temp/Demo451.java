package temp;

import java.util.*;

/*
created by cwy on 2019.03.04
给定一个字符串，请将字符串里的字符按照出现的频率降序排列。

示例 1:

输入:
"tree"

输出:
"eert"

解释:
'e'出现两次，'r'和't'都只出现一次。
因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
示例 2:

输入:
"cccaaa"

输出:
"cccaaa"

解释:
'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。
注意"cacaca"是不正确的，因为相同的字母必须放在一起。
示例 3:

输入:
"Aabb"

输出:
"bbAa"

解释:
此外，"bbaA"也是一个有效的答案，但"Aabb"是不正确的。
注意'A'和'a'被认为是两种不同的字符。
 */
public class Demo451 {
    public String frequencySort(String s) {
        HashMap<String,Integer>map=new HashMap<>();
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<s.length();i++){
            String string=String.valueOf(s.charAt(i));
            if(map.containsKey(string)){
                int g=map.get(string);
                map.put(string,g+1);
            }else
            {
                map.put(string,1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue() - o1.getValue());//对存放字符的map进行排序
        //依次取出map的值拼接成字符串，然后每取出一个就将其values的值减1，最后拼接成字符串
        for(Map.Entry s2:list){
            if(Integer.parseInt(s2.getValue().toString())>1){
                for(int i=0;i<Integer.parseInt(s2.getValue().toString());i++){
                String s1=s2.getKey().toString();
                stringBuffer.append(s1);
                }
            }else
                {
                String s1=s2.getKey().toString();
                stringBuffer.append(s1);
                    }
        }
        return stringBuffer.toString();
    }
}
