package ARRAYS_FOUNDATION;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        reverse(arr,2,5);
    }

    static void reverse(int[] arr, int startId, int endId){

        while (startId < endId){
            int temp = arr[startId];
            arr[startId] = arr[endId];
            arr[endId]=temp;

            startId++;
            endId--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
