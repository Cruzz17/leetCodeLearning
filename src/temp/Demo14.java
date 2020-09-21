package temp;

/*
created by cwy on 2019.01.20
编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。

示例 1:

输入: ["flower","flow","flight"]
输出: "fl"
示例 2:

输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
 */
public class Demo14 {
    public String longestCommonPrefix(String[] strs) {
        int index=0;
        if(strs.length==0)
            return "";
        for(int i=0;i<strs[0].length();i++){
            char temp=strs[0].charAt(index);
            for(String str:strs){
                if(str.length()==i||temp!=str.charAt(index))
                    return str.substring(1,index);
            }
            index++;
        }
        return strs[0].substring(0,index);

    }
    //先比较两个字符串的最长公共子串
//    public String LonggestprefixinTwo(String m, String n){
//        int i=0;
//        int j=0;
//        int l1=m.length();
//        int l2=n.length();
//        while(i<l1&&j<l2){
//            if(m.charAt(i)==n.charAt(j)){
//                i++;
//                j++;
//            }else
//                i++;
//        }
//    }
}
