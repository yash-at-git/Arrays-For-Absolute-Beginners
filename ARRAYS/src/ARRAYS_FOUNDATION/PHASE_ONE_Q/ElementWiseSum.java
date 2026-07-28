package ARRAYS_FOUNDATION.PHASE_ONE_Q;
import java.util.*;


//Q. Find element-wise sum of two arrays.
public class ElementWiseSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3};
        int[] brr = {1,2};
        System.out.println(Arrays.toString(sum(arr, brr)));
        System.out.println(Arrays.toString(prod(arr, brr)));
    }

    static int[] sum(int[] arr, int[] brr){
        int n = arr.length;
        int m = brr.length;
        int[] sumArray = new int[Math.max(n,m)];

        for(int i=0;i<sumArray.length;i++){
            int valA = (i < arr.length) ? arr[i] : 0;
            int valB = (i < brr.length) ? brr[i] : 0;

            sumArray[i] = valA+valB;
        }

        return sumArray;
    }

    static int[] prod(int[] arr, int[] brr){
        int n = arr.length;
        int m = brr.length;
        int[] prodArray = new int[Math.max(n,m)];

        for(int i=0;i<prodArray.length;i++){
            int valA = (i < arr.length) ? arr[i] : 1;
            int valB = (i < brr.length) ? brr[i] : 1;

            prodArray[i] = valA*valB;
        }

        return prodArray;
    }
}
