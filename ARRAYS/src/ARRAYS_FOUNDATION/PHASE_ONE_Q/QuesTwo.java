package ARRAYS_FOUNDATION.PHASE_ONE_Q;
import java.util.*;
public class QuesTwo {
    public static void main(String[] args) {
        //Q. Print only those elements that are greater than a given value k
        int[] arr = {1,2,3,4,5};
        int k = 2;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>k){
                System.out.println(arr[i]);
            }
        }
    }
}
