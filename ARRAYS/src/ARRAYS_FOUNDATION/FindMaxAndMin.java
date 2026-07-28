package ARRAYS_FOUNDATION;

//Aggregation operation

public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {8,3,10,2,5,0,87};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int ans = Integer.MIN_VALUE;

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > ans) {
//                ans = arr[i];
//            }
//        }

        for(int n : arr){ //for each loop
            if(n>ans){
                ans=n;
            }
        }
        return ans;
    }

    static int min(int[] arr){
        int res = Integer.MAX_VALUE;

        for(int i : arr){
            if (i<res){
                res=i;
            }
        }
        return res;
    }


}
