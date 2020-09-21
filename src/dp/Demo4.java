package dp;
/*
最长回文子串
 */
public class Demo4 {
    public String countSubstrings(String s) {
        if(s.isEmpty())
            return null;
        char[]chars=s.toCharArray();
        int l=chars.length;
        int max=1;
        int start=0;
        boolean[][]dp=new boolean[l][l];
        for (int i = 0; i < l ; i++) {
            for (int j = 0; j < i ; j++) {
                if(j-i<2){
                    dp[j][i]= chars[i]==chars[j];
                }
                else{
                    dp[j][i]=dp[j+1][i-1]&&(chars[i]==chars[j]);
                }
                if(dp[j][i]&&(i-j+1)>max){
                    max=i-j+1;
                    start=j;
                }
            }
        }
        return s.substring(start,start+max);
    }
}
