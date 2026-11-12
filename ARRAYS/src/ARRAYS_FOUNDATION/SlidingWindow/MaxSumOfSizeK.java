package ARRAYS_FOUNDATION.SlidingWindow;

public class MaxSumOfSizeK {
//    1. Calculate the sum of the first k elements.
//    2. Set maxSum equal to the initial window sum.
//
//    3. For each remaining element, starting at index k:
//
//    a. Remove the element that leaves the window.
//    b. Add the new element entering the window.
//    c. Update maxSum if the current window sum is larger.
//
//     4. Return maxSum.
    public static void main(String[] args) {
        int[] nums = {4,2,7,1,8,3};
        int k = 3;
        int target = 7;
        //System.out.println(maxSum(nums,k));
        System.out.println(length(nums,target));
    }

    static int maxSum(int[] nums, int k){
        int n = nums.length;
        int windowSum = 0;
        for(int i=0;i<k;i++){
            windowSum+=nums[i];
        }
        int sum = windowSum;

        for (int i=k;i<n;i++){
            windowSum -= nums[i-k];
            windowSum += nums[i];
            sum = Math.max(sum,windowSum);
        }
        return sum;
    }

    //Q. find the minLength of the subarray whose sum is atelast 7.
    static int length(int[] nums, int target){
        int n = nums.length;
        int left =0;
        int minLen = Integer.MAX_VALUE;
        int winSum = 0;

        for(int right=0;right<n;right++){
            winSum+=nums[right];
            while(winSum>=target) {
                minLen = Math.min(minLen, right - left + 1);
                winSum -= nums[left];
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
