package temp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo46 {
    public static List<List<Integer>>lists =new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        ff(nums,0);
        return lists;
    }
    public static void ff(int a[], int k) {
        if (k == a.length - 1) {
            List<Integer> list =new ArrayList<>();
            for (int a1: a) {
                list.add(a1);
            }
            lists.add(list);
            return;
        }
        for (int i = k; i < a.length; i++) {
            int temp = a[i];
            a[i] = a[k];
            a[k] = temp;

            ff(a, k + 1);

            temp = a[i];
            a[i] = a[k];
            a[k] = temp;
        }
    }

}
