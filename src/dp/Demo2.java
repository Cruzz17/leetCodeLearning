package dp;

public class Demo2 {
    public boolean subSet(int[] arr,int i,int sum)
    {
        if(sum==0)
            return true;
        else if(i==0)
            return arr[0]==sum;
        else if(arr[i]>sum)
            return subSet(arr,i-1,sum);
        else
            return subSet(arr,i-1,sum-arr[i])||subSet(arr,i-1,sum);
    }

    public static void main(String[] args) {
        Demo2 demo2=new Demo2();
        int[] arr={1,-1,5,-2,3};
        System.out.println(demo2.subSet(arr,arr.length-1,3));
    }
}
