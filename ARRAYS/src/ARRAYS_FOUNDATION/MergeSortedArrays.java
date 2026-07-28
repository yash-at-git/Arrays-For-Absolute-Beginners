package ARRAYS_FOUNDATION;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a1 = {1,3,5,7};
        int[] a2 = {2,4,6,8};

        int[] s1 = {5,7,9,8};
        int[] s2 = {2,3,6,7};

        int i=0;
        int j=0;
        int k=0;

        mergeUnsorted(s1,s2,i,j,k);

        //mergeSorted(a1,a2,i,j,k);
    }

//    static void mergeSorted(int[] a1, int[] a2, int i, int j, int k){
//        int[] a3 = new int[a1.length+a2.length];
//
//        while(i < a1.length && j < a2.length){
//            if(a1[i]<=a2[j]){
//                a3[k] = a1[i];
//                i++;
//            }else{
//                a3[k] = a2[j];
//                j++;
//            }
//            k++;
//        }
//        while (i<a1.length){
//            a3[k]=a1[i];
//            i++;
//            k++;
//        }
//
//        while (i<a1.length){
//            a3[k]=a1[i];
//            i++;
//            k++;
//        }
//
//        while (j<a2.length){
//            a3[k]=a2[j];
//            j++;
//            k++;
//        }
//
//        System.out.println(Arrays.toString(a3));
//    }

    static void mergeUnsorted(int[] s1, int[] s2, int i, int j, int k) {
        int m = s1.length;
        int n = s2.length;

        int[] s3 = new int[m + n];

        while (i < m) {
            s3[k] = s1[i];
            i++;
            k++;
        }

        while (j < n) {
            s3[k] = s2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(s3));
    }
}
