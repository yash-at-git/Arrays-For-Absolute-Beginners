package ARRAYS_FOUNDATION.PHASE_ONE_Q;
import java.util.*;

//Q.Replace every negative number with 0.
public class ReplaceNegativeWIthZero {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3};
        System.out.println(Arrays.toString(replace(arr)));
        //System.out.println(Arrays.toString(swap(arr)));
    }

    static int[] replace(int[] arr){

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i]=0;
            }
        }
        return arr;
    }

    //Q.swap first and last element
//    static int[] swap(int[] arr){
//
//        int temp = arr[0];
//        arr[0]=arr[arr.length-1];
//        arr[arr.length-1]=temp;
//
//        return arr;
//    }
}
