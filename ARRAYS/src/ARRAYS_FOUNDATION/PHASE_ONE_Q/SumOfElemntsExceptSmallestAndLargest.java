package ARRAYS_FOUNDATION.PHASE_ONE_Q;


//Q. Find the sum of all elements except the largest and smallest.
public class SumOfElemntsExceptSmallestAndLargest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(sum(arr));
    }

    static int sum(int[] arr){
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");//edge case
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int n : arr){
            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }
        }
        for(int n : arr){
            sum+=n;
        }
        return sum - (max+min);
    }
}
