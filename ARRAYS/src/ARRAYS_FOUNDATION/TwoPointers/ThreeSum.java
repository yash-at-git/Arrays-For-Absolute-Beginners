package ARRAYS_FOUNDATION.TwoPointers;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

    }
    static List<List<Integer>> threeSum(int[] nums){
        //OPTIMIZED APPROACH
        int n = nums.length;
        Arrays.sort(nums); //[-4,-1,-1,0,1,2]
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i+1;
            int right = n - 1; //index 5

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0){
                    left++;
                }
                else if (sum > 0) {
                    right--;
                }
                else {//valid triplet.
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
        return result;
    }

    static List<List<Integer>> threeSum2(int[] nums){
        //BRUTE FORCE APPROACH
        int n=nums.length;
        Arrays.sort(nums);

        HashSet<List<Integer>> set = new HashSet<>();

        int target = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == target){
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        set.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
