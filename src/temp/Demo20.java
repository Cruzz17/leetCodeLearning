package temp;

import java.util.Stack;

public class Demo20 {
    public boolean isValid(String s) {
        if(s.length()==0)
            return false;
        Stack<String> result = new Stack<>();
        result.push((String.valueOf(s.charAt(0))));
        for (int i = 1; i < s.length() ; i++) {
            if(String.valueOf(s.charAt(i))==result.peek()){
                result.pop();
            }
        }
        return result.empty();
    }
}
