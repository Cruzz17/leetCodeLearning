package Tooffer;

public class Demo3 {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[nums[i]] == nums[i]) {
                    return nums[i];
                }
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        int [] a = {2,3,1,0,2,5,3};
        System.out.println(demo3.findRepeatNumber(a));
    }

}
