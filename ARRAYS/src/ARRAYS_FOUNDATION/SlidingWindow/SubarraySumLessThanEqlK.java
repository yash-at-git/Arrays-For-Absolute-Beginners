package ARRAYS_FOUNDATION.SlidingWindow;

public class SubarraySumLessThanEqlK {
    public static void main(String[] args) {
        int[] nums = {4,2,7,1,8,3};
        int k=10;
        System.out.println(subarray(nums,k));
    }

    static int subarray(int[] nums, int k){
        int n = nums.length;
        int l = 0;
        int sum = 0;
        int count = 0;

        for(int r=0;r<n;r++){
            sum+=nums[r];

            while(sum>k){
                sum-=nums[l];
                l++;
            }
            count+= r-l+1;
        }
        return count;
    }
}
