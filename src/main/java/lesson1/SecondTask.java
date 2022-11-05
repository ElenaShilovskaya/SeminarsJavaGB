package lesson1;

public class SecondTask {
    public static void main(String[] str) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int k = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
                System.out.println(nums[k]);
                k++;
            }
        }

    }
}
