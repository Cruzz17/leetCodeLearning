package temp;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo945 {
    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        Set<Integer> arr = new LinkedHashSet<>();
        for (int i:A) {
            arr.add(i);
        }
        int count = 0;
        for (int i = 1; i < A.length; i++) {
            if(A[i]==A[i-1]){
                int temp = A[i];
                while (arr.contains(temp)){
                    temp+=1;
                    count++;
                }
                arr.add(temp);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Demo945 demo945 = new Demo945();
        int [] A = {3,2,1,2,1,7};
        System.out.println(demo945.minIncrementForUnique(A));
    }
}
