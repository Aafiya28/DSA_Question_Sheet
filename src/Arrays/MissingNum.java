package Arrays;

public class MissingNum {

    static int missingNum(int[] arr){

        int n = arr.length;

        int rangeSum = (n * (n+1)) / 2;

        int arrSum = 0;
        for(int i=0; i<n; i++){
            arrSum += arr[i];
        }

        return (rangeSum - arrSum);
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 4, 7, 8, 6, 2, 9, 5};

        System.out.println(missingNum(arr));
    }
}
