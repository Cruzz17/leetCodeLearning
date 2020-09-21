package temp;

/*
created by cwy on 2018.01.26
给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。

你可以返回满足此条件的任何数组作为答案。



示例：

输入：[3,1,2,4]
输出：[2,4,3,1]
输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 */
public class Demo905 {
    public int[] sortArrayByParity(int[] A) {
        int i=0;
        int j=A.length-1;
        while(i < j){
            if((A[i] % 2 == 1) && (A[j] % 2 == 0)){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j--;
                i++;
            }
            if(A[i] % 2 == 0){
                i++;
            }
            if(A[j] % 2 == 1){
                j--;
            }
        }
        return A;
    }
}
