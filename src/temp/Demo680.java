package temp;

public class Demo680 {
    public boolean validPalindrome(String s) {
        return isvalidPalindrome(s,1);
    }

    public boolean isvalidPalindrome(String s,int time) {
        System.out.println(s);
        if (s.length() <= 1)
            return true;
        if(s.length()==2)
            return time>=0;
        if(time<0)
            return false;
        int l = 0;
        int r = s.length() - 1;
        if(s.charAt(l)!=s.charAt(r)){
            return isvalidPalindrome(s.substring(l + 1, r + 1),time-1) || isvalidPalindrome(s.substring(l, r),time-1);
        }
        return isvalidPalindrome(s.substring(l+1,r),time);

    }

    public static void main(String[] args) {
        Demo680 demo680 = new Demo680();
        String s = "deeee";
        System.out.println(demo680.validPalindrome(s));
    }
}
