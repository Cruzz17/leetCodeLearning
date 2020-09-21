package temp;

import java.util.Arrays;

/*
leetcode_455分配饼干11.30
 */
public class Demo455 {
    public int fp(int[]g,int[]s){
        Arrays.sort(g);
        Arrays.sort(s);
        int gi=0,si=0;
        while (gi<g.length&&si<s.length){
            if(g[gi]<=s[si])
                gi++;
            si++;
        }
        return gi;
    }
}
