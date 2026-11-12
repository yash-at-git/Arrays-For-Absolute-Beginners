package ARRAYS_FOUNDATION.SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringPermutation {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
    }

    static boolean checkInclusion(String s1, String s2){
        if(s1.length() > s2.length()) return false;

        int n = s1.length();
        Map<Character,Integer> window = new HashMap<>();
        Map<Character,Integer> target = new HashMap<>();

        for(int i=0;i<n;i++){
            char ch = s1.charAt(i);
            target.put(ch,target.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<n;i++){
            char c = s2.charAt(i);
            window.put(c, window.getOrDefault(c,0)+1);
        }

        if(window.equals(target)){
            return true;
        }

        int l = 0;
        for(int r = n; r<s2.length(); r++){
            char leaving = s2.charAt(l); //char leaving the window.
            char incoming = s2.charAt(r);
            window.put(leaving, window.get(leaving)-1);

            if(window.get(leaving) == 0){
                window.remove(leaving);
            }

            window.put(incoming, window.getOrDefault(incoming, 0)+1);
            l++;

            if(window.equals(target)){
                return true;
            }
        }
        return false;
    }

    //PERMUTATION IN STRING - USING FREQ. ARRAY APPROACH :

    static boolean isPermutation(String s1, String s2){
        int n = s1.length(), m = s2.length();
        if(n > m) return false;

        int[] target = new int[26];
        int[] window = new int[26];

        // 1. Build frequency array for s1 AND the first window of s2 (size n)
        for(int i = 0; i < n; i++){
            target[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        // Check if the first window is a permutation
        if(Arrays.equals(target, window)){
            return true;
        }

        // 2. Slide the window across the rest of s2
        int l = 0;
        for(int r = n; r < m; r++){
            window[s2.charAt(l) - 'a']--; // Remove the character leaving the left
            window[s2.charAt(r) - 'a']++; // Add the character entering the right
            l++;

            // Check equality after every slide
            if(Arrays.equals(target, window)){
                return true;
            }
        }
        return false;
    }
}
