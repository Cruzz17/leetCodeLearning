package Sort;

import java.util.Arrays;

public class FastSort {
    public  static void sort(int[]arr,int left,int right){
        if(left>=right)
            return ;
        int i=left,j=right;

        int key=arr[i];
        while (i<j){
            while(arr[j]>=key&&i<j){
            j--;
            }
        if(i<j)
            swap(arr,i,j);
        while (arr[i]<=key&&i<j)
        {
            i++;
            }
            if (i<j)
              swap(arr,i,j);
        }
        sort(arr,left,i-1);
        sort(arr,i+1,right);
    }
    public static void swap(int[]arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int []arr1={2,4,5,7,1,-5,6,9,-7};
        sort(arr1,0,arr1.length-1);
        System.out.println(Arrays.toString(arr1));
    }
}
