package ARRAYS_FOUNDATION.PHASE_ONE_Q;
import java.util.*;

//Q.Compare two arrays and check if they are equal in both order and elements.
public class CompareOrderAndElements {
    public static void main(String[] args) {
        int[] arr1={2,3,1};
        int[] arr2={1,2,3};
        System.out.println(sameElements(arr1,arr2));
    }
//    static boolean check(int[] arr1, int[] arr2){
//
//        int n = arr1.length;
//        int m = arr2.length;
//        if(n!=m) return false;
//
//        for(int i=0;i<n;i++){
//            if(arr1[i]!=arr2[i]) return false;
//        }
//
//        return true;
//    }

    //Q.Compare two arrays and check if they contain the same elements ignoring order.

    static boolean sameElements(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int n = arr1.length;
        int m = arr2.length;
        if(n!=m) return false;

        for(int i=0;i<n;i++){
            if(arr1[i]!=arr2[i]) return false;
        }

        return true;
    }
}
