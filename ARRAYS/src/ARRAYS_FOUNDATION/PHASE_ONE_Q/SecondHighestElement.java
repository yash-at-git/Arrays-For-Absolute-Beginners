package ARRAYS_FOUNDATION.PHASE_ONE_Q;
import java.util.*;

//Q.Find the second largest element in an array.

public class SecondHighestElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 2};

        System.out.println(second(arr));
    }

    static int second(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int n : arr){
            if(n>max1){
                max2=max1;
                max1=n;
            } else if (n > max2 && n != max1) { // the second check makes sure duplicates are also handled well.
                max2=n;
            }
        }
        return max2;
    }
}
