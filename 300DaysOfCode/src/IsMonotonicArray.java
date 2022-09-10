public class IsMonotonicArray {

    public static void main(String[] args) {
        int[] arr = { 1,2,2,3};
        System.out.println(isMonotonicArray(arr));
    }

    public static boolean isMonotonicArray(int[] nums) {
        int len = nums.length;
        boolean isIncreasing = false;

        for(int i = 1; i < nums.length ; i ++) {
            if(nums[i-1] == nums[i]) {
                continue;
            } else if(nums[i] > nums[i-1]) {
                isIncreasing = true;
                break;
            } else {
               break;
            }
        }
        if(isIncreasing) {
            for(int i = 2 ; i< nums.length ; i++ ) {
                if(nums[i-1] > nums [i]) {
                    return false;
                }
            }
        } else {
            for(int i = 2 ; i< nums.length ; i++ ) {
                if(nums[i-1] < nums [i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
