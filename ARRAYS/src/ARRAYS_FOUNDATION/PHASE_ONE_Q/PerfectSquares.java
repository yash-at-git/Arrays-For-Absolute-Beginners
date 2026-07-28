package ARRAYS_FOUNDATION.PHASE_ONE_Q;

public class PerfectSquares {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int count = 0;

        for (int n : arr) {
            if (isPerfectSquare(n)) count++;
        }
        System.out.println(count);
    }

    static boolean isPerfectSquare(int n){

        if(n<1) return false;

        int root = (int) Math.sqrt(n);

        return root * root  == n;
    }
}
