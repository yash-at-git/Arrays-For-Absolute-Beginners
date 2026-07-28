package ARRAYS_FOUNDATION.PHASE_ONE_Q;
import java.util.*;

//Q.Find the common elements between two arrays.

public class FindCommonElements {
    public static void main(String[] args) {
        int[] arr1={2,1,2,8,7,1,8};
        int[] arr2={1,2,3,6};

        common(arr1,arr2);

        //brute force - not optimal cuz n^2 and can thandle dupes
//        for(int n : arr1){
//            for(int m : arr2){
//                if(n == m){
//                    System.out.println(n);
//                }
//            }
//        }
    }
//optimal and handle dupes as well
    static void common(int[] arr1, int[] arr2){
        HashSet<Integer> set= new HashSet<>();

        for(int n : arr1){
            set.add(n);
        }

        for(int num : arr2){
            if(set.contains(num)){
                System.out.println(num);
            }
        }
    }
}
