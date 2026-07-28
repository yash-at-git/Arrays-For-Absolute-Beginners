package ARRAYS_FOUNDATION.PHASE_ONE_Q;

//Q. Count the prime numbers in the array
public class CountPrimesInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int count = 0;

        for (int n : arr) {
            if (isPrime(n)) count++;
        }
        System.out.println(count);
    }

    static boolean isPrime(int n){

        if (n<2) return false;

        for(int i=2; i*i<=n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
