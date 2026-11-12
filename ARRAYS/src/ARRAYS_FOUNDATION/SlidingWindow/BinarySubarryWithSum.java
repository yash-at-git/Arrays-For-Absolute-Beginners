package ARRAYS_FOUNDATION.SlidingWindow;

public class BinarySubarryWithSum {
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(binarySum(nums,goal));
    }

    static int binarySum(int[] nums, int goal){
        return atMost(nums,goal) - atMost(nums, goal-1);
    }

    static int atMost(int[] nums, int goal){
        int n = nums.length;
        int count = 0;
        int l = 0;
        int sum = 0;

        if(goal<0) return 0;

        for(int r=0; r<n; r++) {
            sum += nums[r];

            while(sum>goal){
                sum-=nums[l];
                l++;
            }

            count+=r-l+1;
        }
        return count;
    }
}
