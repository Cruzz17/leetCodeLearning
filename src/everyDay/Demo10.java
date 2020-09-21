package everyDay;

public class Demo10 {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int i :
                A) {
            sum += i;
        }
        if (sum % 3 != 0)
            return false;
        int falg = sum / 3;
        int count = 0;
        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            temp += A[i];
            if (temp == falg) {
                temp = 0;
                count++;
            }
        }
        if(falg==0 && count>=3)
            return true;
        return count == 3;
    }

    public static void main(String[] args) {
        Demo10 demo10 = new Demo10();
        int [] A = {10,-10,10,-10,10,-10,10,-10};
        demo10.canThreePartsEqualSum(A);
    }
}
