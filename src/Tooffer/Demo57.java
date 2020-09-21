package Tooffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo57 {
    public int[][] findContinuousSequence1(int target) {
        int begin =1;
        int end = begin+1;
        int sum =0;
        List<int[]> result = new ArrayList<>();
        while (begin<end){
            sum = (begin+end)*(end- begin+1)/2;
            if(sum>target){
                begin++;
            }else if(sum<target){
                end++;
            }else {
                int [] arr = new int[end -begin+1];
                for (int j = 0,i=begin; i <end ; i++,j++) {
                    arr[j]=i;
                }
                result.add(arr);
                begin++;
            }
        }
        int [][] res = new int[result.size()][];
        return result.toArray(res);

    }
















    public int[][] findContinuousSequence(int target) {
        int begin = 1,end = begin +1, sum = 0;
        List<int[]> res = new ArrayList<>();
        while(begin < end){
            sum = ((begin + end) * (end-begin+1))/2;
            if(sum   < target){
                end++;
            }else if(sum > target){
                begin++;
            }else{
                int[] arr = new int[end-begin+1];
                for(int j = 0,i = begin; i <= end; i++,j++){
                    arr[j] = i;
                }
                res.add(arr);
                begin++;
            }
        }
        int[][] result = new int[res.size()][];
        return res.toArray(result);
    }
}
