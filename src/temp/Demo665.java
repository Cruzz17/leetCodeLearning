package temp;

public class Demo665 {
    public boolean checkPossibility(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                count++;
                if(i - 2 >= 0 && nums[i - 2] > nums[i]) nums[i] = nums[i-1];
                else nums[i-1]=nums[i];
            }
        }
        return count<=1;
    }

    public static void main(String[] args) {
        int []arr={-1,4,2,3};
        Demo665 demo665=new Demo665();
        System.out.println(demo665.checkPossibility(arr));
    }
}
