package everyDay;

public class Demo3 {
    public void merge(int[] A, int m, int[] B, int n) {
        int index1=m-1;
        int index2=n-1;
        int l = m+n-1;
        while (m>=0 || n>=0) {
            if(index1<0){
                A[l--]=B[index2--];
            }else if(n<0){
                A[l--]=A[index1--];
            }else if(A[index1]>B[index2]){
                A[l--]=B[index2--];
            }else {
                A[l--]=A[index1--];
            }
        }
    }

    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        int[] A = {2,0};
        int[] B = {1};
        demo3.merge(A, 1, B, 1);
        System.out.println(A.toString());
    }
}
