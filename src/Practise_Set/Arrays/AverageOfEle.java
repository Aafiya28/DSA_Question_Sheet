package Practise_Set.Arrays;

public class AverageOfEle {

    static double getAverage(int[] arr){

        int n = arr.length;
        int sum = 0;

        for(int num : arr){
            sum += num;
        }
        return ((double) sum/n);
    }

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6,8};

        System.out.printf("Average of element of array : %.2f%n", getAverage(arr));
    }
}
