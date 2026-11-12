package ARRAYS_FOUNDATION.SlidingWindow;

public class MaxConsecutiveOnes3 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(ones(nums,k));
    }

    static int ones(int[] nums, int k){
        int n = nums.length;
        int zero = 0;
        int maxLen = 0;
        int l=0;

        for(int r=0; r<n; r++){
            if(nums[r] == 0){
                zero++;
            }

            while(zero>k){
                if(nums[l] == 0){
                    zero--;
                }
                l++;
            }
            maxLen = Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}
