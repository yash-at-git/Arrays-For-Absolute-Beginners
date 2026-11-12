package ARRAYS_FOUNDATION.SlidingWindow;

public class SubarraySumEqlToK {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3};
        int k = 3;
        System.out.println(subarrays(nums,k));
    }

    static int subarrays(int[] nums, int k){
        int n = nums.length;
        int count = 0;
        int l = 0;
        int sum = 0;

        for(int r=0; r<n; r++){
            sum+=nums[r];

            while(sum>k){
                sum-=nums[l];
                l++;
            }

            if(sum==k){
                count++;
            }
        }
        return count;
    }
}
