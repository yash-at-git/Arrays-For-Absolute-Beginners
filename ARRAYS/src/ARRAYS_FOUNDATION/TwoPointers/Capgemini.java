package ARRAYS_FOUNDATION.TwoPointers;
import java.util.Scanner;

public class Capgemini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
        for(int i=0;i<n;i++){
            blocks[i] = sc.nextInt();
        }
        System.out.println(height(blocks,n));
    }
    static int height(int[] blocks, int n){ //[1,2,3,4,5,4]4
        if(n<2) return n;
        int maxHeight = 1;
        int currentHeight = 1;

        int i = 1;
        while (i < n) {
            if (blocks[i] <= blocks[i - 1]) {
                currentHeight++;
            } else {
                currentHeight = 1;
            }

            maxHeight = Math.max(maxHeight, currentHeight);
            i++;
        }

        return maxHeight;
    }
}
