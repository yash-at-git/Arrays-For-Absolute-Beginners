package ARRAYS_FOUNDATION.PHASE_ONE_Q;
import java.util.*;

//Q.Create a new array containing squares of all numbers.
public class SquareArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        //System.out.println(Arrays.toString(Squared(arr)));
        System.out.println(Arrays.toString(newSquared(arr)));

    }

//    static int[] Squared(int[] arr){
//        for(int i=0;i< arr.length;i++){
//            arr[i]=arr[i]*arr[i];
//        }
//        return arr;
//    }

    static int[] newSquared(int[] arr){
        int[] squared = new int[arr.length];

        for(int i=0;i< arr.length;i++){
            squared[i]=arr[i]*arr[i];
        }
        return squared;
    }
}
