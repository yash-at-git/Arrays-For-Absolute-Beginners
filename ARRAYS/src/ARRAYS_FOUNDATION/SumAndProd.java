package ARRAYS_FOUNDATION;

public class SumAndProd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sum(arr));
        System.out.println(prod(arr));
    }

    static int sum(int[] arr) {
        int ans=0;

        for(int n : arr){
            ans+=n;
        }
        return ans;
    }

    static int prod(int[] arr) {
        int ans=1;

        for(int n : arr){
            ans*=n;
        }
        return ans;
    }
}
