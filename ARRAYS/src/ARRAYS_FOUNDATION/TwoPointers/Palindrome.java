package ARRAYS_FOUNDATION.TwoPointers;

public class Palindrome {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        //System.out.println(isPalindrome(arr));
        System.out.println(isPalinromicString("racecar"));

    }

    static boolean isPalindrome(int[] arr){
        //this method handles string input with punctuations
        int s = 0;
        int e = arr.length-1;

        while(s < e){
            if(arr[s] != arr[e]){
                return false;
            }
            s++;
            e--;
        }

        return true;
    }

    static boolean isPalinromicString(String s){
        if(s.isBlank() || s.length() < 2) return true;

        int i=0;
        int j=s.length()-1;

        while (i < j) {

            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) !=
                    Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}
