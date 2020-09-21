package temp;

/**
 * 老师想给孩子们分发糖果，有 N 个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。

 你需要按照以下要求，帮助老师给这些孩子分发糖果：

 每个孩子至少分配到 1 个糖果。
 相邻的孩子中，评分高的孩子必须获得更多的糖果。
 那么这样下来，老师至少需要准备多少颗糖果呢？

 示例 1:

 输入: [1,0,2] 1，2，3，4，0
              1，2  3  4 1

 输出: 5
 解释: 你可以分别给这三个孩子分发 2、1、2 颗糖果。
 示例 2:

 输入: [1,2,2,3]
       1,2,1,2
 输出: 4
 解释: 你可以分别给这三个孩子分发 1、2、1 颗糖果。
 第三个孩子只得到 1 颗糖果，这已满足上述两个条件。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/candy
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo135 {
    public int candy(int[] ratings) {
        if(ratings==null || ratings.length == 0)
            return 0;
        int nums[] = new int[ratings.length];
        nums[0]=1;
        for (int i = 1; i < ratings.length; i++) {
            //如果前一位比后一位大，则给他前一位+1，否则就给1
            if(ratings[i]>ratings[i-1]){
                nums[i] = nums[i-1]+1;
            }else {
                nums[i]=1;
            }
        }
        //从后遍历，如果前一位比后一位大，并且糖果要小，就给前一位是后一位+1
        for (int i = ratings.length-1; i >0 ; i--) {
            if(ratings[i]>ratings[i-1] && nums[i]<nums[i-1]){
                nums[i-1]=nums[i]+1;
            }
        }
        int count = 0;
        for(int i : nums){
            count +=i;
        }
        return count;
    }


}
