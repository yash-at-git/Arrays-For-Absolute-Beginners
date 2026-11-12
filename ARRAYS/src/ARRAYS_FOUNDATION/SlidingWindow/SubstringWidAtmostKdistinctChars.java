package ARRAYS_FOUNDATION.SlidingWindow;
import java.util.*;

public class SubstringWidAtmostKdistinctChars {
    //Q. Find the length of the longest substring containing at most K distinct characters.
    public static void main(String[] args) {
        String s = "aab";
        System.out.println(atMostK(s,3));
    }

    static int atMostK(String s, int k){
        if (k <= 0 || s == null || s.length() == 0) return 0;

        int n = s.length();
        int l = 0;
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int r=0;r<n;r++){
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0)+1);

            while(map.size()>k){
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar)-1);

                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}
