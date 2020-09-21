package dp;

public class Demo983 {
    public int mincostTickets(int[] days, int[] costs) {
        int [] dp = new int[days[days.length-1]];
        int a,b,c;
        for (int i = 0; i < days.length; i++) {
            dp[days[i]]=-1;
        }
        for (int i = 1; i < dp.length; i++) {
            if(dp[i]==0)
                dp[i]=dp[i-1];
            else{
                a=dp[i-1]+costs[0];
                if(i-7>=0){
                    b=dp[i-7]+costs[1];
                }else {
                    b=costs[1];
                }
                if(i-30>=0)
                    c=dp[i-30]+costs[2];
                else
                    c=costs[2];
                dp[i]=Math.min(a,b);
                dp[i]=Math.min(dp[i],c);
            }
        }
        return dp[dp.length-1];
    }
}
