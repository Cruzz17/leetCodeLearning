package temp;

/*
created by cwy on2019.02.28
给定一个只包含整数的有序数组，每个元素都会出现两次，唯有一个数只会出现一次，找出这个数。

示例 1:

输入: [1,1,2,3,3,4,4,8,8]
输出: 2
示例 2:

输入: [3,3,7,7,10,11,11]
输出: 10
注意: 您的方案应该在 O(log n)时间复杂度和 O(1)空间复杂度中运行。


 */
public class Demo540 {
    public int singleNonDuplicate(int[] nums) {
        for(int i=0;i<nums.length-2;i++){
            if(judge(nums[i],nums[i+1],nums[i+2]))
                return nums[i+2];
            else
                return nums[i];
        }
       return 0;
    }
    public boolean judge(int a,int b,int c){
        if(a==b)
            return false;
        if(b==c)
            return true;
        return true;
    }

    public static void main(String[] args) {
        int[]a={1,1,2};
        Demo540 demo540=new Demo540();
//        demo540.singleNonDuplicate(a);
        System.out.println(demo540.singleNonDuplicate(a));
    }
}
