package Tooffer;

import java.util.Arrays;

public class Demo61 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int zero = 0;
        for (int i = 0; i <4 ; i++) {
            if(nums[i]==0){
                zero++;
                continue;
            }
            if(nums[i]==nums[i+1])
                return false;
            zero-=(nums[i+1]-nums[i]-1);
        }
        return zero>=0;
    }

    public static void main(String[] args) {
        Demo61 demo61 = new Demo61();
        int []a = {1,2,3,4,5};
        System.out.println(demo61.isStraight(a));
    }
}
