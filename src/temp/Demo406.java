package temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
created by cwy on 2019.03.02
假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对(h, k)表示，其中h是这个人的身高，k是排在这个人前面且身高大于或等于h的人数。 编写一个算法来重建这个队列。

注意：
总人数少于1100人。

示例

输入:
[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

输出:
[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 */
public class Demo406 {
    public int[][] reconstructQueue(int[][] people) {
        if(people==null||people.length==0||people[0].length==0)
            return new int[0][0];
        Arrays.sort(people,(a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];//如果第一个相等就按照第二个值的升序排列
            return b[0]-a[0];//否则按照第一个的降序排列
        });
        int N = people.length;
        List<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int index = people[i][1];
            int[] p = new int[]{people[i][0], people[i][1]};
            tmp.add(index, p);
        }

        int[][] ret = new int[N][2];
        for (int i = 0; i < N; i++) {
            ret[i][0] = tmp.get(i)[0];
            ret[i][1] = tmp.get(i)[1];
        }
        return ret;
    }

    public static void main(String[] args) {
        Demo406 demo406=new Demo406();
        int[][]arr={{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        System.out.println(demo406.reconstructQueue(arr));
    }
}
