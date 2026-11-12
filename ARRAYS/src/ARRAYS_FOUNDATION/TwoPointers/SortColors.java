package ARRAYS_FOUNDATION.TwoPointers;
import java.util.*;

public class SortColors {
    public static void main(String[] args) {
        int[] colors = {2,0,2,1,1,0};
        sorted(colors);
    }

    static void sorted(int[] colors) {
        int n = colors.length;
        int low = 0;
        int high = n - 1;
        int mid = 0;

        while (mid <= high) {
            if (colors[mid] == 0) {
                swap(colors, low, mid);
                low++;
                mid++;
            } else if (colors[mid] == 2) {
                swap(colors, mid, high);
                high--;
            } else {
                mid++;
            }
        }
        System.out.println(Arrays.toString(colors));
    }

    static void swap(int[] colors, int first, int second) {
        int temp = colors[first];
        colors[first] = colors[second];
        colors[second] = temp;
    }
}
