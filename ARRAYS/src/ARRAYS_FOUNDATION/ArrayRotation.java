package ARRAYS_FOUNDATION;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        rotateRightByOne(arr);
//        rotateLeftByOne(arr);
//        int k=1;
//        k = k% arr.length; //4
//
//        reverse(arr,0,arr.length-k-1);
//        reverse(arr,arr.length-k,arr.length-1);
//        reverse(arr,0,arr.length-1);


    }
    static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    //rotate array left by 1
    static void rotateLeftByOne(int[] arr){
        int temp = arr[0];

        for(int i=0; i< arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }

    //rotate array right by 1
    static void rotateRightByOne(int[] arr){
        int temp = arr[arr.length-1];

        for(int i = arr.length-1; i > 0; i--){
            arr[i]=arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
