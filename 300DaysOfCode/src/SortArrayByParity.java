import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] nums = new int[]{3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int j = 0 ;
        for(int i =0 ; i< nums.length;i++) {
            if(nums[i]%2==0) {
                swap(nums,i,j);
                j++;
            }
        }
        return nums;
    }

    public static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
