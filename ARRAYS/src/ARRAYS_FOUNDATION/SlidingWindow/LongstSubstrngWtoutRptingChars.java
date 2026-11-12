package ARRAYS_FOUNDATION.SlidingWindow;
import java.util.*;


public class LongstSubstrngWtoutRptingChars {
    public static void main(String[] args) {
        String s = "abcbde";
        System.out.println(longest(s));
    }

    static int longest(String s){
        int n = s.length();
        int maxLen = 0;
        int l = 0;
        Set<Character> set = new HashSet<>();

        for(int r=0;r<n;r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxLen = Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}
