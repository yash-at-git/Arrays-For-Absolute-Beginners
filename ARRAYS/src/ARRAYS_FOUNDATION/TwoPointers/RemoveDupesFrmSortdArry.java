package ARRAYS_FOUNDATION.TwoPointers;

import java.util.Arrays;

public class RemoveDupesFrmSortdArry {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    static int removeDuplicates(int[] nums){
        int n = nums.length;
        int s = 0;

        if(n==0) return 0;

        for(int f=1; f<n; f++){
            if(nums[f] != nums[s]){
                s++;
                nums[s] = nums[f];
            }
        }
        return s+1;
    }
}
