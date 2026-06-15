package Practise_Set.Arrays;

public class CountZeros {

    static int[] getCountZerosOne(int[] arr){

        int n = arr.length;
        int countZero = 0;
        int countOnes = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                countZero++;
            }else {
                countOnes++;
            }
        }

        int[] count = {countZero, countOnes};

        return  count;
    }

    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 0, 1, 1, 0, 1, 1};

        int[] result = getCountZerosOne(arr);

        System.out.println("Numbers of 0's count: " + result[0]);
        System.out.println("Numbers of 1's count: " + result[1]);
    }


}
