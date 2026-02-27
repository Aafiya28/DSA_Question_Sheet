package Arrays;

import java.util.Scanner;

public class Mean {

    //Mean of an Array
    static int meanArr(int[] arr){

        int n = arr.length;

        int sum = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        int mean = sum/n;

        return mean;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = {1,3, 4, 2, 6, 5, 7, 8};

        int mean = meanArr(arr);

        System.out.println("Mean on an array is: " + mean);
    }
}
