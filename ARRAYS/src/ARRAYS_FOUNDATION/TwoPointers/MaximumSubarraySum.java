package ARRAYS_FOUNDATION.TwoPointers;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(sum(nums));
    }

    static int sum(int[] nums){
        int n = nums.length;
        if(n==0) return 0;

        int cMax = nums[0];
        int cMin = nums[0];
        int ans = nums[0];

        for(int i=1; i<n; i++){
            int prevMax = cMax;
            int prevMin = cMin;

            cMax = Math.max(nums[i], Math.max(nums[i]*prevMax, nums[i]*prevMin));
            cMin = Math.min(nums[i], Math.min(nums[i]*prevMax, nums[i]*prevMin));

            ans = Math.max(ans, cMax);
        }
        return ans;
    }
}
