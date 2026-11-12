package ARRAYS_FOUNDATION.TwoPointers;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 2, 2, 3, 10};
        System.out.println(Arrays.toString(square(nums)));
    }

    static int[] square(int[] nums){
        int n = nums.length;
        int r = n-1;
        int l = 0;
        int[] res = new int[n];
        int pos = n-1;

        while (l<=r){
            int ls = nums[l]*nums[l];
            int rs = nums[r]*nums[r];

            if(ls>rs){
                res[pos] = ls;
                l++;
            } else {
                res[pos] = rs;
                r--;
            }
            pos--;
        }
        return res;
    }
}
