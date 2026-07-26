package Practise_Set.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    static void average(int[] arr){

        int n = arr.length;
        double sum = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        double avg = sum/n;
        System.out.println("Average no. of this array: " + avg);
    }

    static void multiplication(int num){

        for(int i=1; i<=10; i++){
            System.out.println(num + " * " + i  + " = " + num*i);
        }

    }

    static int binarySearch(int[]arr, int x){

        int n = arr.length;

        int low = 0;
        int high = n-1;

        int ans = 0;

        while (low < high){

            int mid = (low+high)/2;

            if(x == arr[mid]){
                return mid;
            }else if(arr[mid] > x){
                high = mid-1;
            }else {
                low = mid+1;
            }

            ans = mid;
        }

        return ans;
    }

    static void findLargestElement(int[] arr){

        int n = arr.length;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;


        for(int i=0; i<n; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest element of array is: " + largest);
        System.out.println("Second largest element of array is: " + (secondLargest == Integer.MIN_VALUE ? -1 : secondLargest));
    }

    static void findSmallestElement(int[] arr){

        int n = arr.length;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Smallest element of array is: " + smallest);
        System.out.println("Second smallest element of array is: " + (secondSmallest == Integer.MAX_VALUE ? -1 : secondSmallest));
    }

    static void sum(int[]arr){

        int n = arr.length;

        int positiveSum = 0;
        int negativeSum = 0;

        for(int i=0; i<n; i++){
            if(arr[i] >= 0){
                positiveSum += arr[i];
            }else {
                negativeSum += arr[i];
            }
        }

        System.out.println("Sum of +ve numbers are: " + positiveSum);
        System.out.println("Sum of -ve numbers are: " + negativeSum);
    }

    static ArrayList<Integer> list(int[] arr){

        int n = arr.length;

        ArrayList<Integer> list = new ArrayList<>();
        int zeros = 0;
        int onces = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                zeros++;
            }else if(arr[i] == 1){
                onces++;
            }
        }

        list.add(zeros);
        list.add(onces);

        return list;
    }

    static int findMaxConsecutiveOnes(int[] arr){

        int n = arr.length;

        int max = 0;
        int count = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                count++;
                max = Math.max(max, count);
            }else {
                count = 0;
            }
        }
        return max;
    }

    static int findFirstUnsortedEle(int[] arr){

        //To be continue....

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6,7,8,9};

        average(arr);

        multiplication(10);

        System.out.println(7 + " Present at index: " + binarySearch(arr, 7));

        findLargestElement(arr);
        findSmallestElement(arr);

        int[] num = {-2, 3, 5, -6, 9, -1, 7, -8};
        sum(num);

        int[] nums = {0, 1, 0, 0, 1, 1, 0};
        ArrayList<Integer> result = new ArrayList<Integer>(list(nums));

        System.out.println(result);

        System.out.println(findMaxConsecutiveOnes(nums));

        int[] arr1 = {2,3,2, 4, 3};
        System.out.println(findFirstUnsortedEle(arr1));
    }
}
