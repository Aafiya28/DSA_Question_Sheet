package Arrays;

import java.util.Scanner;

public class MinimumConsecutive {

    static void minConnsecutive(int[] arr){

        int n=arr.length;

        for(int i=1; i<n; i++){
            if(arr[i] != arr[i-1]){
                if(arr[i] != arr[0]){
                    System.out.print("From " + i + " to ");
                }else {
                    System.out.println(i-1);
                }
            }
        }

        if(arr[n-1] != arr[0]){
            System.out.println(n-1);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. element in array: ");
        int n = sc.nextInt();

        int[] arr  = new int[n];
        System.out.print("Enter element's in array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        minConnsecutive(arr);
    }

    public static class Reverse {

        //Arrays.MinimumConsecutive.Reverse Element of An Array
        static void reverseArr(int[] arr){

            int n = arr.length;

            int low = 0;
            int high = n-1;

            while(low < high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }

        public static void main(String[] args){

            int[] arr  = {1,2,3,4,5,6,7,8,9,10};

            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();

            reverseArr(arr);

            for(int num : arr){
                System.out.print(num + " ");
            }
        }
    }
}
