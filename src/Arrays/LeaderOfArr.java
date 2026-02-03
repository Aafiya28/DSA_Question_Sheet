package Arrays;

public class LeaderOfArr {

    static void leaderOfArr(int[] arr){

        int n = arr.length;

        int maxRight = arr[n-1];
        System.out.print(maxRight + " ");

        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] > maxRight){
                maxRight = arr[i];
                System.out.print(maxRight + " ");
            }
        }
    }

    public static void main(String[] args){

        int[] arr = {7, 10, 4, 10, 6, 5, 2};

        leaderOfArr(arr);
    }
}
