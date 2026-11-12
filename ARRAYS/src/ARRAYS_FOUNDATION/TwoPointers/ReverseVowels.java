package ARRAYS_FOUNDATION.TwoPointers;
import java.util.*;

//Q.1. Reverse Vowels of a String (LeetCode 345)The Problem: Given a string s, reverse only all the
// vowels in the string and return it. (e.g., s = "leetcode" $\rightarrow$ output = "leotcede").Why
// it's asked: It is the exact mirror of the space-preserving question. Instead of checking for spaces,
// you check if both pointers are pointing at vowels (a, e, i, o, u), and swap them
// only when both conditions are met. If one points at a consonant, you move that pointer inward.

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "my name is string";
        System.out.println(reverse(s));
    }

    static String reverse(String s){
        int n = s.length();
        int l = 0;
        int r = n-1;
        char[] chars = s.toCharArray();

        while(l<r){
                while(l<r && !isVowel(chars[l])){
                    l++;
                }
                while(l<r && !isVowel(chars[r])){
                    r--;
                }
                char temp = chars[l];
                chars[l] = chars[r];
                chars[r] = temp;
                l++;
                r--;
        }
        return new String(chars);
    }

    static boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch) != -1;
//        return ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u' ||
//                ch == 'A' || ch =='E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}

