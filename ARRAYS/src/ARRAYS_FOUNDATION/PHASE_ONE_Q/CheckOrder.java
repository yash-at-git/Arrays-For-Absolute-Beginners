package ARRAYS_FOUNDATION.PHASE_ONE_Q;
import java.util.*;

public class CheckOrder {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] brr = {5,4,3,2,1};

        System.out.println(isAscending(arr));
        System.out.println(isAscending(brr));

        System.out.println(isDescending(arr));
        System.out.println(isDescending(brr));

    }
    //Q.Check if the array is sorted in Ascending order.
    static boolean isAscending(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }
    //Q.Check if the array is sorted in descending order.
    static boolean isDescending(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]) return false;
        }
        return true;
    }
}
