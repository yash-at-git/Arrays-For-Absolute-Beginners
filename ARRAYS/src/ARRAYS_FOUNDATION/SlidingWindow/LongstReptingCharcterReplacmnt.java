package ARRAYS_FOUNDATION.SlidingWindow;

public class LongstReptingCharcterReplacmnt {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 1;
        System.out.println(longest(s,k));
    }

    static int longest(String s, int k){
        int n = s.length();
        int l = 0;
        int maxFreq = 0;
        int maxLen = 0;
        int[] freq = new int[26];

        for(int r=0;r<n;r++){
            char ch = s.charAt(r);

            freq[ch-'A']++;
            maxFreq = Math.max(maxFreq, freq[ch-'A']);

            while((r-l+1) - maxFreq > k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxLen = Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}
