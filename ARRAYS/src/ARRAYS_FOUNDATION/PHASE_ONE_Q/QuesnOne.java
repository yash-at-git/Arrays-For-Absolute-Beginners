package ARRAYS_FOUNDATION.PHASE_ONE_Q;
import java.util.*;


//Qsn. Input n and store n integers in an array, then print them.

public class QuesnOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements to be stored in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("enter the "+ (i+1) + " element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        //System.out.println("avg of arr is : "+ findAvg(arr,n));
        //count(arr);
        MaxIndex(arr);
    }

    static double findAvg(int[] arr, int n){
        //add all elements and divided by n

        int sum=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];
        }

        double avg = (double)sum/n;
        return avg;
    }

    //Q. Count how many elements are positive, negative, or zero.

    static void count(int[] arr){
        int countNeg = 0;
        int countPos = 0;
        int countZero = 0;

        for(int n : arr){
            if(n<0) countNeg++;
            else if (n == 0) {
                countZero++;
            }else countPos++;
        }

        System.out.println("the array has "+countNeg+" negative numbers " + countZero + " zeroes " + countPos + " positive numbers");
    }

    //Q. return ihndex of max element
    static void MaxIndex(int[] arr){
        int max = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        System.out.println("index of amx element in arr is :  "+max);
    }
}
