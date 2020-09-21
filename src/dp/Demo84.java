package dp;

public class Demo84 {
    public int largestRectangleArea(int[] heights) {
        int res = 0;
        // 先找到左边最大的，
        for (int i = 0; i < heights.length; i++) {
            //找到左边第一个比它小的坐标
            int l = 0, r = 0;
            l=i;
            for (int j = i-1; j >=0 ; j--) {
                if(heights[j]>=heights[i])
                    l--;
                else
                    break;
            }
            r=i;
            for (int j = i+1; j < heights.length; j++) {

                if(heights[j]>=heights[i])
                    r++;
                else
                    break;
            }
            res = Math.max((r - l+1) * heights[i], res);
        }
        return res;
    }

    public static void main(String[] args) {
        Demo84 demo84 = new Demo84();
        int[] nums = {2, 1, 5, 6, 2, 3};
        System.out.println(demo84.largestRectangleArea(nums));
    }
}
