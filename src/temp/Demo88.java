package temp;

import java.util.Arrays;

public class Demo88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m;i<nums1.length;i++){
            if (j<n){
            nums1[i]=nums2[j];
            j++;
            }
        }
        Arrays.sort(nums1,0,m+n-1);
    }

    public static void main(String[] args) {
        Demo88 demo88=new Demo88();
        int[] arr1={2,0};
        int[] arr2={1};
        int m=1;
        int n=1;
        demo88.merge(arr1,m,arr2,n);
        System.out.println(arr1.toString());
    }
}
