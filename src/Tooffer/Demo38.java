package Tooffer;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Demo38 {
    public String[] permutation(String s) {
        String [] result;
        if(s==null || s.length()==0)
            return null;
        Set<String> res = new LinkedHashSet<>();
        boolean[] visted =new boolean[s.length()];
        dfs(s, res, new StringBuilder(),visted);
        result = new String[res.size()];
        res.toArray(result);
        return result;
    }

    public void dfs(String s, Set<String> result, StringBuilder temp, boolean[] visted){
        if(temp.length()==s.length()){
            result.add(temp.toString());
            return;
        }
        for (int i =0; i<s.length();i++) {
            if(visted[i])
                continue;
            visted[i]=true;
            temp.append(s.charAt(i));
            dfs(s,result,temp, visted);
            temp.deleteCharAt(temp.length()-1);
            visted[i]=false;
        }
    }

    public static void main(String[] args) {
        Demo38 demo38 =new Demo38();
        System.out.println(demo38.permutation("abc").toString());
    }
}
