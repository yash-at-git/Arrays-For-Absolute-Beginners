package ARRAYS_FOUNDATION.PHASE_ONE_Q;
import java.util.*;


//Q. Find the difference between the largest and smallest element.
public class DiffrnceBtwSmallstLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sum(arr));
    }

    static int sum(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least 2 elements");
        }

        int min = Integer.MAX_VALUE; //you can also assign both min and max with : arr[0] i.e is the first element of the array then compare other with it.
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int n : arr) {
            sum += n;

            if (n < min) {
                min = n;
            }

            if (n > max) {
                max = n;
            }
        }

        return sum - min - max;
    }
}
