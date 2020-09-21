package temp;

/*
created by cwy on2018 01.24
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

示例 1:

输入: 123
输出: 321
 示例 2:

输入: -123
输出: -321
示例 3:

输入: 120
输出: 21
 */
public class Demo7 {
    public int reverse(int x) {
        boolean flag = true;
        if (x < 0) {
            x = Math.abs(x);
            flag = false;
        }
        StringBuffer reverse = new StringBuffer();
        reverse.append(x);
        try {
            int a = Integer.parseInt(reverse.reverse().toString());
            if (flag) {
                return a;
            }else {
                return -a;
            }
        } catch (Exception e) {
            return 0;
        }
    }

}
