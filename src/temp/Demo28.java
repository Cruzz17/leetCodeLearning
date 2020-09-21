package temp;

/*
created by cwy on 2019.1.08
实现 strStr() 函数。
给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
示例 1:

输入: haystack = "hello", needle = "ll"
输出: 2
示例 2:

输入: haystack = "aaaaa", needle = "bba"
输出: -1
说明:
h e l l o
    i
j
l l

当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。

对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 */
public class Demo28 {
    public int strStr(String haystack, String needle) {
        /*int h=0,n=0;
        int count=0;
        if(haystack.length()==0||needle.length()==0)
            return 0;
        while(h<haystack.length()&&n<needle.length()){
            if(haystack.charAt(h)==needle.charAt(n)){
                count=h;
                h++;
                if(n<needle.length()-1)
                    n++;
                else if(n==needle.length()-1)
                    return count;
            }
            h++;
        }
        return -1;*/
        if(needle.length()==0)
            return 0;
        for(int i=0;i<haystack.length()-needle.length();i++){
            if(haystack.substring(i,i+needle.length()).equals(needle))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String h="hello world";
        String n="ll";
        Demo28 demo28=new Demo28();
        System.out.println(demo28.strStr(h,n));

    }
}
