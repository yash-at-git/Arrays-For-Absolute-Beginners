package ARRAYS_FOUNDATION.TwoPointers;
import java.util.*;

//Q.Reverse Only Letters (LeetCode 917)The Problem: Given a string s, reverse the string according
//to the following rules: all characters that are not English letters stay in the same position,
//and all English letters reverse their positions. (e.g., s = "a-bC-dEf=ghIj" -> output = "j-Ih-gfE-dCba").
//Why it's asked: This is structurally identical to the "reverse string preserving spaces" problem,
//but instead of checking for a single character (' '), you use Character.isLetter(c) to skip special
//symbols, hyphens, and numbers.


public class ReverseLettersOnly {
    public static void main(String[] args) {
        String s = "ab-cd";
        System.out.println(reverseLetters(s));
    }

    static String reverseLetters(String s){
        int l=0;
        char[] chars = s.toCharArray();
        int r = chars.length - 1;

        while(l<r){
            if(Character.isLetter(chars[l]) && Character.isLetter(chars[r])){
                char temp = chars[l];
                chars[l] = chars[r];
                chars[r] = temp;
                l++;
                r--;
            }
            l++;
            r--;
        }
        return new String(chars);
    }
}

