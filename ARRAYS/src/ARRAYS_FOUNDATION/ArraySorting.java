package ARRAYS_FOUNDATION;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] unSorted = {7,6,3,5,2,1};
//        descSort(unSorted);



//        //Bubble sort - u can do both asc and dec sort by just changing the conditon
//        for (int i=0;i<unSorted.length-1;i++) {
//            for (int j = 1; j < unSorted.length - i; j++) {
//                if (unSorted[j] > unSorted[j - 1]) {
//                    swap(unSorted, j, j - 1);
//                }
//            }
//        }
//        System.out.println(Arrays.toString(unSorted));
    }

    static void swap(int[] unSorted,int first, int second){
        int temp = unSorted[first];
        unSorted[first] = unSorted[second];
        unSorted[second] = temp;
    }

//    static void descSort(int[] unSorted){ //using inbuilt sort function to arrange the aray in desc order (sort + reverse = desc sort)
//        Arrays.sort(unSorted);
//
//        int start = 0;
//        int end = unSorted.length-1;
//
//        while(start<end){
//            swap(unSorted,start,end);
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.toString(unSorted));
//    }
}
