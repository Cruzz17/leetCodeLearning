package temp;

import java.util.Arrays;

/*
created by cwy on 2019.03.03
 */
public class Demo215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    private int partition(int[] a, int l, int h) {
        int i = l, j = h + 1;
        while (true) {
            while (i < h && less(a[++i], a[l])) ;
            while (j > l && less(a[l], a[--j])) ;
            if (i >= j) break;
            swap(a, i, j);
        }
        swap(a, l, j);
        return j;
    }

    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private boolean less(int v, int w) {
        return v < w;
    }
}
