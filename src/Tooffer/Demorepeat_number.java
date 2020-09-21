package Tooffer;

import java.util.Arrays;

public class Demorepeat_number {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null||numbers.length<=0)
            return false;
        Arrays.sort(numbers);
        int flag=0;
        for (int i=0;i<length-1;i++){
            if(numbers[i]==numbers[i+1]){
                duplication[0]=numbers[i];
                flag=1;
                break;
            }
        }
        return flag==1?true:false;
    }
}
