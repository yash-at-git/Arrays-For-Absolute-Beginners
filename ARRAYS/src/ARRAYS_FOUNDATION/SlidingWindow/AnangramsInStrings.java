package ARRAYS_FOUNDATION.SlidingWindow;
import java.sql.SQLOutput;
import java.util.*;

public class AnangramsInStrings {
    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        System.out.println(anagrams(s,p));
        System.out.println(anagram(s,p));
    }

    static List<Integer> anagrams(String s, String p){
        int sLen = s.length();
        int pLen = p.length();
        List<Integer> res = new ArrayList<>();
        int[] target = new int[26]; //p
        int[] window = new int[26]; //s

        if(pLen>sLen) return res;

       for(int i=0;i<pLen;i++){
           target[p.charAt(i)-'a']++; //building freq. array of p.
           window[s.charAt(i)-'a']++;
       }

//        for(int i=0;i<pLen; i++){
//            window[s.charAt(i)-'a']++; //freq. array of window of size p.length()
//        }

        if(Arrays.equals(target,window)){
            res.add(0);
        }

        int l=0;
        for(int r=pLen; r<sLen; r++){
            window[s.charAt(l)-'a']--;
            window[s.charAt(r)-'a']++;
            l++;

            if(Arrays.equals(window, target)){
                res.add(l);
            }
        }
        return res;
    }

    //CLASSIC HASHMAP IMPLEMENTAION TO HANDLE BOTH LOWER AND UPPER CASES IN STRING.
    static List<Integer> anagram(String s, String p){
        int sLen = s.length(), pLen = p.length();
        List<Integer> res = new ArrayList<>();
        if(pLen>sLen) return res;

        Map<Character,Integer> target = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for(int i=0;i<pLen;i++){
            target.put(p.charAt(i), target.getOrDefault(p.charAt(i),0)+1);
            window.put(s.charAt(i),window.getOrDefault(s.charAt(i),0)+1);
        }

        if(target.equals(window)){
            res.add(0);
        }

        int l=0;
        for(int r=pLen;r<sLen;r++){
            char leftChar = s.charAt(l);
            char rightChar = s.charAt(r);

            window.put(leftChar, window.get(leftChar)-1);
            if(window.get(leftChar) == 0){
                window.remove(leftChar);
            }
            window.put(rightChar, window.getOrDefault(rightChar,0)+1);
            l++;

            if(target.equals(window)){
                res.add(l);
            }
        }
        return res;
    }
}
