package ARRAYS_FOUNDATION.TwoPointers;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedWater(height));
    }

    static int trappedWater(int[] height){
        int n = height.length;
        int left = 0;
        int right = n-1;
        int water = 0;
        int rightMax = 0;
        int leftMax = 0;

        while(left<right){
            if(height[left] <= height[right]){
                leftMax = Math.max(leftMax, height[left]);
                water+=leftMax - height[left];
                left++;
            }else{
                rightMax = Math.max(rightMax, height[right]);
                water+= rightMax - height[right];
                right--;
            }
        }
        return water;
    }
}
