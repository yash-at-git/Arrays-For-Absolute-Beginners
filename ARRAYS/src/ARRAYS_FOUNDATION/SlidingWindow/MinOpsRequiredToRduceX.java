package ARRAYS_FOUNDATION.SlidingWindow;

public class MinOpsRequiredToRduceX {
    public static void main(String[] args) {
        int[] nums = {1,1,4,2,3};
        int x = 5;
        System.out.println(reduce(nums,x));
    }

    static int reduce(int[] nums, int x){
        int n = nums.length;
        int tSum = 0;
        for(int num : nums){
            tSum+=num;
        }
        int target = tSum-x;
        int maxLen = -1;
        int sum = 0;
        int l=0;

        if(target < 0){
            return -1;
        } else if (target==0) {
            return n;
        }

        for(int r=0;r<n;r++){  //O(n)
            sum+=nums[r];

            while(sum > target){
                sum-=nums[l];
                l++;
            }

            if(sum == target){
                maxLen = Math.max(maxLen,r-l+1);
            }
        }
        return maxLen == -1 ? -1 : n-maxLen; // v. imp
    }
}
