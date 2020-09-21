package Sort;

public class GuiBingSort {
    public void merge(int []a ,int left,int right,int mid){
        int tmp[]=new int[a.length];
        int p1=left,p2=mid+1,k=right;
        while (p1<=left&&p2<=right){
            if(a[p1]<=a[p2])
                tmp[k++]=a[p1++];
            else
                tmp[k++]=a[p2++];
        }
        while (p1<=mid)tmp[k++]=a[p1++];
        while (p2<=right)tmp[k++]=a[p2++];
        for (int i=left;i<=right;i++){
            a[i]=tmp[i];
        }
    }
    public void sort(int[]a,int start,int end){
        int mid=(start+end)/2;
        sort(a,start,mid);
        sort(a,mid,end);
        merge(a,start,end,mid);
    }
}
