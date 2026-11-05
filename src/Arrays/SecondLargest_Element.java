package Arrays;

import java.util.*;

public class SecondLargest_Element {

    /* Brute Force Solution -  Time Complexity: O(N log N) * Space Complexity: O(1) */
    static void getSecondLargestBrute(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            System.out.println("Second Largest Element: -1");
            return;
        }

        Arrays.sort(arr);
        int largest = arr[n - 1];
        int second_largest = Integer.MIN_VALUE;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                second_largest = arr[i];
                break;
            }
        }

        second_largest = (second_largest == Integer.MIN_VALUE ? -1 : second_largest);
        System.out.println("Second Largest Element: " + second_largest);
    }

    /* Better Solution - Time Complexity: O(2N) * Space Complexity: O(1) */
    static void getSecondLargestBetter(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            System.out.println("Second Largest Element: -1");
            return;
        }

        int largest = arr[0];
        int second_largest = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > second_largest && arr[i] < largest) {
                second_largest = arr[i];
            }
        }

        System.out.println("Second Largest Element: " + second_largest);
    }

    /* Optimal Solution - Time Complexity: O(N) * Space Complexity: O(1) */
    static int getSecondLargestOptimal(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; ++i) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > second) {
                second = arr[i];
            }
        }

        return second == Integer.MIN_VALUE ? -1 : second;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 2, 2, 9, 17, 8, 12};

        System.out.println("--- Second Largest Element Approaches ---");

        System.out.print("Brute Force Solution -> ");
        getSecondLargestBrute(arr.clone()); // Cloning to avoid array manipulation out of order

        System.out.print("Better Solution      -> ");
        getSecondLargestBetter(arr);

        System.out.print("Optimal Solution     -> ");
        System.out.println("Second Largest Element: " + getSecondLargestOptimal(arr));
    }

}
