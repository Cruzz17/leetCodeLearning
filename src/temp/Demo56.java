package temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo56 {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length<=1)
            return intervals;
        Arrays.sort(intervals, (a,b)->a[1]-b[1]);
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] cur = intervals[i];
            int[] peek = res.get(res.size()-1);
            if(cur[0]>peek[1]){
                res.add(cur);
            }else{
                peek[1] = Math.max(cur[1],peek[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        Demo56 solution = new Demo56();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] res = solution.merge(intervals);
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }

}
