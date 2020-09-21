package temp;

public class Demo42 {
    public int trap1(int[] height) {
        int res = 0;
        for (int i = 1; i < height.length ; i++) {
            int leftMax = 0, rightMax = 0;
            for (int j = 0; j <=i ; j++) {
                leftMax = Math.max(leftMax,height[j]);
            }
            for (int j = i; j < height.length ; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            res += Math.min(leftMax,rightMax) -height[i];
        }
        return res;
    }
    public int trap(int[] height) {
        int res = 0;
        int length = height.length;
        int[][]dp = new int[length][2];
        dp[0][1]=height[0];
        dp[length-1][0] = height[length-1];
        for (int i = 1; i < length ; i++) {
            dp[i][0]=Math.max(height[i],dp[i-1][0]);
        }
        for (int i = length-2; i >0 ; i--) {
            dp[i][1] = Math.max(height[i],dp[i+1][1]);
        }
        for (int i = 1; i < length-1 ; i++) {
            res += Math.min(dp[i][0],dp[i][1]) -height[i];
        }
        return res;
    }
}
