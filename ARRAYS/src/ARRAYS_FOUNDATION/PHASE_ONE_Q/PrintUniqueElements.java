package ARRAYS_FOUNDATION.PHASE_ONE_Q;

import java.util.*;

//Q.Print all unique elements that occur exactly once.
public class PrintUniqueElements {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5,0};
        unique(arr);
    }
    static void unique(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>(); //using hashmap to track occurrence of each element

        for(int n : arr){ //traversing the array and inserting them in the hashmap.
            map.put(n,map.getOrDefault(n,0)+1); //this will insert each element in the hashmap and increase the freq by 1. it also handles the elements that do not already present in the map
        }

        for(int n : arr){
            if(map.get(n) == 1){ //elements which have freq = 1 only they will be printed.
                System.out.println(n + " ");
            }
        }
    }
}
