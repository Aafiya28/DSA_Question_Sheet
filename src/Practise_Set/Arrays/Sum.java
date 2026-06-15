package Practise_Set.Arrays;

import java.util.Scanner;

public class Sum {

    //Return Sum of +ve and -ve numbers
    static void sum (int[] arr){

        int n = arr.length;
        int positive = 0;
        int negative = 0;

        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                positive += arr[i];
            }else {
                negative += arr[i];
            }
        }

        System.out.println("Sum of -ve integers are: " + positive + "\nSum of -ve integer are: " + negative);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {23, -64, -57, 89, 12, -11, 15};

        sum(arr);
    }
}
