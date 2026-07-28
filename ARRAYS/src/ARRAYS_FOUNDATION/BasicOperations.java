package ARRAYS_FOUNDATION;
import java.util.*;

//THIS MODULE IS ABOUT BASIC OPERATIONS OF ARRAY WE ARE GOING TO LEARN FOUNDATIONAL KNOWLEDGE OF ARRAYS

public class BasicOperations {
    public static void main(String[] args) {
        //1. HOW TO CREATE A ARRAY ?
//        int n = 5; //size of array is 5; initially it was like [0,0,0,0,0]
//        int[] arr = new int[n]; // first way to create an array by passing a dynamic value to decide the size of array;
//
//        int[] arr2 = {1, 2, 3, 21, 5}; //second way, direct element insertion;
//
//        //how to insert elements in the array created using the first method;
//        arr[1] = 1; // value of 1st index is now 1
//        arr[2] = 2; //index 2 = 2
//        arr[3] = 3;
        //now the array is -> [0,1,2,3,0]

        //printing the arrays
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));

        //accessing the element at a particular index;
        //System.out.println(arr[1]); //access the value of array at index 1

       // arr[1] = 5; //updating the element at a particular index
//        System.out.println(arr[1]);

        //traversing a array;
//        for (int i=0;i<arr2.length;i++){
//            System.out.print(arr2[i] + " ");
//        }

        //length of array
        //System.out.println(arr.length); // 5
        //System.out.println(arr.length-1); // length reduced by 1

        //accessing the last and second last elements
        //System.out.println(arr[arr.length-1]); //


        //* INSERTING ELEMENTS IN THE ARRAY *

        //insert at end
       // int[] newArr = new int[arr.length+1]; // create a new array of one size bigger than the previous array then -
//        System.out.println("before insertion at last index : " + Arrays.toString(newArr));
//        newArr[arr.length] = 9;
//        System.out.println("after insertion at last index : " + Arrays.toString(newArr));
        //wait, why the array has other elemnents as 0? cuz we created a new array in order to make it identical we must copy th element of previous array to the new one

        //copying elements from arr to newArr

        //for(int i=0;i<arr.length;i++){
         //   newArr[i] = arr[i];
        //}
//        System.out.println("newArr after copying the elements from arr : " + Arrays.toString(newArr));


        //inserting element at the beginning of an array
        //System.out.println("new array before insertion : " + Arrays.toString(newArr));
        //int[] arr3 = new int[newArr.length+1];
        //arr3[0] = 9;
        //using inbuilt function
        //System.arraycopy(newArr, 0, arr3, 1, arr.length); // using inbuilt funnction for array copying
       // System.out.println("newArr after copying the elements from arr : " + Arrays.toString(arr3));

        //insert at a particular index using manual method
        int[] arr3 = {1,2,3,4,5};
        int index = 3;
        int value = 69;

        int[] arr4 = new int[arr3.length+1];

//        for(int i=0;i<index;i++){
//            arr4[i] = arr3[i];
//        }
//        arr4[index] = value;
//        for(int i=index;i<arr3.length;i++){
//            arr4[i+1] = arr3[i];
//        }
//        System.out.println(Arrays.toString(arr3));
//        System.out.println(Arrays.toString(arr4));

        //insert at a particular index using inbuilt function method

        System.arraycopy(arr3,0,arr4,0,index);
        arr4[index] = value;
        System.arraycopy(arr3,index,arr4,index+1,arr3.length-index);

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));




    }
}
