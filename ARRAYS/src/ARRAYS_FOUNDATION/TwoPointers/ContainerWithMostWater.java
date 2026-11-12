package ARRAYS_FOUNDATION.TwoPointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(area(height));
    }

    static int area(int[] h){
        int n = h.length;
        int maxArea = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int ht = Math.min(h[i], h[j]);
                int w = j-i;
                int area = ht*w;

                maxArea = Math.max(area, maxArea);

            }
        }
        return maxArea;
    }

    static int optimizedArea(int[] h){
        int n = h.length;
        int left = 0;
        int right = n-1;
        int maxArea = 0;

        while (left < right ){
            int height = Math.min(h[left], h[right]);
            int width = right - left;
            int area = height*width;

            maxArea = Math.max(area,maxArea);

            if(h[left] < h[right]) left++;
            else right--;
        }
     return maxArea;
    }
}
