package temp;

/*
created by cwy on 2018.01.11
给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。

此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。

注意:
不能使用代码库中的排序函数来解决这道题。

示例:

输入: [2,0,2,1,1,0]
输出: [0,0,1,1,2,2]
进阶：

一个直观的解决方案是使用计数排序的两趟扫描算法。
首先，迭代计算出0、1 和 2 元素的个数，然后按照0、1、2的排序，重写当前数组。
你能想出一个仅使用常数空间的一趟扫描算法吗？
快速排序，因为给定了0，1，2，按照1为分割，小于1的在左边，大于1的在右边
 */
public class Demo75 {
    public void sortColors(int[] nums) {
        int less=-1;//小于
        int more=nums.length;
        int i=0;
        while(i<more){
            if(nums[i]<1){
                swap(nums,++less,i++);
            }
            else if(nums[i]>1){
                swap(nums,--more,i);
            }
            else{
                i++;
            }
    }}
    private void swap(int[] nums,int m,int n){
        int t= nums[m];
        nums[m]=nums[n];
        nums[n]=t;
    }

    public static void main(String[] args) {
        int []num={2,0,1,2,0,1,2,1,2};
        Demo75 demo75=new Demo75();
        demo75.sortColors(num);
    }
}
