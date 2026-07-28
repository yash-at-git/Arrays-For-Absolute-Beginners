package ARRAYS_FOUNDATION;
import java.util.*;


public class FrequencyMap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 3, 3, 5, 6, 7, 55, 5, 7, 7, 8, 8};
        System.out.println(freq(arr));
    }

    static HashMap<Integer, Integer> freq(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        return hm;
    }
}


//for (int num : arr)
//    {
//        if (freq.containsKey(num))
//        {
//            freq.put(num, freq.get(num) + 1);
//        }
//        else
//        {
//            freq.put(num, 1);
//        }
//    }
//
//System.out.println(freq);



