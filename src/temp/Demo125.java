package temp;

/*
created by cwy on 2019.01.09
给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

说明：本题中，我们将空字符串定义为有效的回文串。

示例 1:

输入: "A man, a plan, a canal: Panama"
输出: true
示例 2:

输入: "race a car"
输出: false
 */
public class Demo125 {
    public boolean isPalindrome(String s) {
        if (s==null)
            return true;
        s=s.toLowerCase();//转小写
        s=s.replaceAll("[^0-9a-z]","");//替换，查询原版的api
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }
}
