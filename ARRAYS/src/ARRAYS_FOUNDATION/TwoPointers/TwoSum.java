package ARRAYS_FOUNDATION.TwoPointers;

public class TwoSum {
    //find all the pairs which are equal to t and print their indices
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 8};
        int t = 10;

        int i = 0;
        int j = arr.length - 1;


        while (i <= j) {
            int sum = arr[i] + arr[j];
            if ( sum == t) {
                System.out.println("index " + i + " and " + j + " is equal to " + sum );
                i++;
                j--;
            } else if (sum < t) {
                i++;
            } else {
                j--;
            }
        }
    }
}
