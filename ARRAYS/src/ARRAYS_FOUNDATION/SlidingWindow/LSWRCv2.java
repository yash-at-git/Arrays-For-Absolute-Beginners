package ARRAYS_FOUNDATION.SlidingWindow;
import java.util.*;

//Q. find the longest substring having atmost 2 distinct characters.

public class LSWRCv2 {
    public static void main(String[] args) {
        String s = "eceba";
        System.out.println(length(s));
    }

    static int length(String s){
        int n = s.length();
        int maxLen = 0;
        int l = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int r = 0; r < n; r++) {
            char ch = s.charAt(r);
            // 1. Add/increment the current character in the map
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // 2. Shrink the window if distinct characters exceed 2
            while (map.size() > 2) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(s.charAt(l)) - 1);

                // If the count of leftChar drops to 0, remove it from the map
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                l++;
            }
            // 3. Update maxLen after the window is valid
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}
