package temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
leetcode524通过删除字符找到最佳匹配的字符串
 */
public class Demo524 {
    public String findLongestString(String s, List<String>d){
        String LongestWord ="";
        for(String target:d){
            int l=LongestWord.length(),t=target.length();
            if(l>t||l==t&&LongestWord.compareTo(target)<0)
                continue;
            if(isValid(s,target))
                LongestWord=target;
        }
        return LongestWord;

    }
    public boolean isValid(String s,String target){
        int si=0,t=0;
        while (si<s.length()&&t<target.length()){
            if(s.charAt(si)==target.charAt(t))
                t++;
            si++;
        }
        return t==target.length();
    }

    public static void main(String[] args) {
        String s="abdpdpflse";
        List<String> d=new ArrayList<>(Arrays.asList("ale","apple","monkey","sssss"));
        Demo524 demo524=new Demo524();
        System.out.println(demo524.findLongestString(s,d));
    }
}
