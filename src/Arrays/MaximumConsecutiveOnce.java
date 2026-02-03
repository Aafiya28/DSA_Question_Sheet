package Arrays;

import java.util.Scanner;

public class MaximumConsecutiveOnce {

    static int findMaxCansecutiveOnce(int[] arr){

        int n = arr.length;

        int res = 0;
        int max = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                res++;
                max = Math.max(res, max);
            }else {
                res = 0;
            }
        }

        return max;
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

        int ans = findMaxCansecutiveOnce(arr);

        System.out.println("Maximum Consecutive of Once in this array is: " + ans);
    }
}
