package ARRAYS_FOUNDATION.TwoPointers;
import java.util.*;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(sum2(nums,target)));
    }

    private static int[] sum(int[] nums,int target){
        int n = nums.length;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int sum = nums[i]+nums[j];
                if(sum == target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }

    private static int[] sum2(int[] nums,int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[]{-1,-1};
    }
}
