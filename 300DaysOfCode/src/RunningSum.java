import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int nums[] = new int[]{1,2,3,4};
        // output = [1,3,6,10]
        System.out.print(Arrays.toString(runningSum(nums)));

    }

    public static int[] runningSum(int[] nums) {
        int runningSum = nums[0];
        for(int i = 1; i<nums.length;i++) {
            runningSum += nums[i];
            nums[i] = runningSum;
        }
        return nums;
    }
}
