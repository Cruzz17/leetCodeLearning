package temp;

import java.time.LocalTime;
import java.util.*;

public class Demo6666 {

    //参选名单
    public static final int[] DONE = {30,46,23,49,29, 47, 5, 3, 53, 11,35,2,1,44};
    //要抽4个
    public static final int num = 4;
    //总共人数14个
    public static final int total = 14;

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println("现在的时间：" + time.toString());
        Arrays.sort(DONE);
        List list = new ArrayList();
        for (int i : DONE) {
            list.add(i);
        }
        System.out.println("已参选人尾数" + list.toString());

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while (arrayList.size() != num) {
            Random random = new Random();
            //int nextInt(int n)：返回[0,n) 范围内的随机数。这里n取14,对结果加1表示取 [1,15)
            int tem = random.nextInt(total) + 1;
            if (!list.contains(tem) && !arrayList.contains(tem)) {
                arrayList.add(tem);
            }
        }
        System.out.println("被抽中的人："+arrayList.toString());
        System.out.println("1：" + arrayList.get(0));
        System.out.println("2：" + arrayList.get(1));
        System.out.println("3：" + arrayList.get(2));
        System.out.println("4：" + arrayList.get(3));

    }}

