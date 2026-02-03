package Arrays;

import java.util.Scanner;

public class FrequencyOfX {

    static int findFreq(int[] arr, int X){

        int n=arr.length;
        int freq = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == X){
                freq++;
            }
        }

        return freq;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of element in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter element in array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to find its frequency: ");
        int X = sc.nextInt();

        int ans = findFreq(arr, X);
        System.out.println(ans);
    }
}
