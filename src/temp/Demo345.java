package temp;

import java.util.Arrays;
import java.util.HashSet;

public class Demo345 {
    private final static HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    public String reverseVowels(String s) {
        int l = 0;
        int r = s.length()-1;
        if(s == null)
            return null;
        char [] result = new char[s.length()];
        while (l<=r){
            char cl = s.charAt(l);
            char cr = s.charAt(r);
            if(!vowels.contains(cl)){
                result[l++]=cl;
            }else if(!vowels.contains(cr)){
                result[r--]=cr;
            }else {
                result[l++]=cr;
                result[r--]=cl;
            }
        }
        return (result.toString());
    }


}
