package everyDay;

import java.util.HashSet;
import java.util.Set;

public class Demo128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num:nums) {
            set.add(num);
        }
        int res = 0;
        for (int num:nums) {
            int current = num;
            int currentLongest = 1;
            while (set.remove(current-1)) current--;
            currentLongest += (num-current);
            current = num;
            while (set.remove(current+1)) current++;
            currentLongest += (current-num);
            res = Math.max(res,currentLongest);
        }
        return res;
    }

    public static void main(String[] args) {
        Demo128 de = new Demo128();
        int [] nums = {100,2,98,1, 3,4};
        System.out.println(de.longestConsecutive(nums));
    }
}
