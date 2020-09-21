package Tooffer;

public class Demo67 {
    public int strToInt(String str) {
        int flag = 1;
        long res = 0;
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(0) != '+' && str.charAt(0) != '-' && !Character.isDigit(str.charAt(0)))
            return 0;
        if (str.charAt(0) == '-') {
            flag = -1;
            str = str.substring(1);
        } else if (str.charAt(0) == '+') {
            str = str.substring(1);
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) return flag * (int) res;
            res = res * 10 + c - '0';
            if (res > Integer.MAX_VALUE && flag > 0)
                return Integer.MAX_VALUE;
            else if(res > Integer.MAX_VALUE && flag < 0){
            return Integer.MIN_VALUE;}
        }
        return flag * (int) res;
    }

    public static void main(String[] args) {
        Demo67 demo67 = new Demo67();
        System.out.println(demo67.strToInt("-42"));
        char c = '7';
        System.out.println(c-'0');

    }
}
