package ARRAYS_FOUNDATION.PHASE_ONE_Q;


//Q.Count how many pairs of elements have a sum equal to a given number k.
public class SumEqualToK { //this is a classic question of two pointer method.
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 12; //target sum.
        System.out.println(sum(arr,k));
    }

    static int sum(int[] arr, int k){
        int left=0; //pointer one - placed at the 0th index.
        int right=arr.length-1; //P2 - placed at last element.
        int count=0; //to count the number of pairs equal to k.

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == k) {
                count++;//increase the counter by 1.
                left++;//move the pointer to next element
                right--;
            } else if (currentSum < k) {//if sum is less than k, increase the left pointer cuz we have sorted array
                left++;
            } else {
                right--; // move right pointer if sum is greater than K cuz we have large elements on the right side so reducing them is a good option.
            }
        }
        return count;
    }
}
