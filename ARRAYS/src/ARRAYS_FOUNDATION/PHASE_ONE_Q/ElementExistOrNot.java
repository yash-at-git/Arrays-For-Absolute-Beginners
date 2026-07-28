package ARRAYS_FOUNDATION.PHASE_ONE_Q;


//Q. Check whether a given element exists in the array.
public class ElementExistOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int t = 5;
        System.out.println(isPresent(arr,t));
    }

    static boolean isPresent(int[] arr, int t){
        for(int n : arr){
            if(n == t) return true;
        }
        return false;
    }
}
