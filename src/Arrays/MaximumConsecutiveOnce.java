package Arrays;

import java.util.Scanner;

public class MaximumConsecutiveOnce {

    // Brute force Solution - TC: O(N^2), SC: O(1).
    static int getMaxConsecutiveOnce(int[] arr){

        int n = arr.length;
        int maxLength = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                int countLength = 0;
                for(int j=i; j<n; j++){
                    if(arr[j] == 1){
                        countLength++;
                    }else {
                        break;
                    }
                }
                maxLength = Math.max(maxLength, countLength);
            }
        }

        return maxLength;
    }

    //Optimal Solution - TC: O(N), SC: O(1).
    static int findMaxConsecutiveOnce(int[] arr){

        int n = arr.length;

        int count = 0;
        int max = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                count++;
                max = Math.max(count, max);
            }else {
                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args){

        int[] arr = {1, 0, 1, 1, 1, 0, 1, 1};

        int ans = findMaxConsecutiveOnce(arr);

        System.out.println("Maximum Consecutive of Once in this array is: " + ans);

        int result = getMaxConsecutiveOnce(arr);
        System.out.println("Maximum Consecutive of Once is : " + result);
    }
}
