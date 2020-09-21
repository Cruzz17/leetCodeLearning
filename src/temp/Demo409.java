package temp;

public class Demo409 {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        for (char c: s.toCharArray()) {
            arr[c]++;
        }
        int count = 0;
        for (int i : arr) {
            count += (i % 2);
        }
        //在对char数组遍历的时候 只能出现一个个数为奇数的字符
        // 所以我们直接记录有多少个字符出现次数为奇数就可以了啊 不用额外判断了
        return count == 0 ? s.length() : (s.length() - count + 1);
    }

    public static void main(String[] args) {
        Demo409 demo409 = new Demo409();
        System.out.println(demo409.longestPalindrome("adcccsdsadazA"));
    }
}
