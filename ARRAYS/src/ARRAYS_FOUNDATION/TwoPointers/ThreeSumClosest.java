package ARRAYS_FOUNDATION.TwoPointers;
import java.util.*;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(closest(nums,target));
    }

    private static int closest(int[] nums, int target){
        int n = nums.length;
        Arrays.sort(nums);
        int closestSum = nums[0]+nums[1]+nums[2];

        for(int i=0; i<n-2; i++){
            int left = i+1;
            int right = n-1;

            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == target) return target;

                if(Math.abs(sum-target) < Math.abs(closestSum-target)){
                    closestSum = sum;
                }
                if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return closestSum;
    }
}
