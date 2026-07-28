package ARRAYS_FOUNDATION.PHASE_ONE_Q;
import java.util.*;


//Q. Create a frequency array of numbers.
public class FrequencyArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,2,1,5,0,0,0,0,0};

        int max = 5;

        System.out.println(Arrays.toString(freq(arr, max)));
    }

    static int[] freq(int[] arr, int max){
        int[] freqArr = new int[max+1];

        for(int n : arr){
            freqArr[n]++;
        }
        return freqArr;
    }
}
