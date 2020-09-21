package Tooffer;

public class Demo10 {
    public int numWays(int n) {
        if(n==0)
            return 1;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int [] dp = new int[n+1];
        dp[0]=1;
        dp[1] =1;
        for (int i = 2; i <=n ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Demo10 demo10 = new Demo10();
        System.out.println(demo10.numWays(3));
    }
}
