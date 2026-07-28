package ARRAYS_FOUNDATION;

import java.util.Arrays;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77};
        int k = 4;

        split(arr,k);
    }

    static void split(int[] arr, int k){
        int n = arr.length;
        int[] first = new int[k];
        int[] second = new int[n-k];

        int i=0;
        int j=0;

        while(i < k){
            first[i]=arr[i];
            i++;

        }

        while(j<n-k){
            second[j]=arr[i];
            i++;
            j++;

        }
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

    }
}
