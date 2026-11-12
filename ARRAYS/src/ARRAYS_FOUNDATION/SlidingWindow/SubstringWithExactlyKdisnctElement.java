package ARRAYS_FOUNDATION.SlidingWindow;

import java.util.HashMap;
import java.util.Map;
//Q.return the number of substrings that contains exactly k distinct elements
public class SubstringWithExactlyKdisnctElement {
    public static void main(String[] args) {
        String s = "aab";
        int k = 2;
        System.out.println(exactlyK(s,k));
    }

    static int exactlyK(String s, int k) {
        return SubstrngWidExctlyKDistnctElmnts(s, k) - SubstrngWidExctlyKDistnctElmnts(s, k - 1);
    }

    static int SubstrngWidExctlyKDistnctElmnts(String s, int k){
        if(k<0) return 0;

        int n = s.length();
        int l = 0;
        int count = 0;
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
            count += (r-l+1);
        }
        return count;
    }
}
