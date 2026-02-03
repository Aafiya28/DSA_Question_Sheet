package Arrays;

import java.util.Scanner;

public class Searching {
    public Searching() {
    }

    static int searchEle(int[] arr, int target) {
        int n = arr.length;

        for(int i = 0; i < n; ++i) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];

        int target;
        for(target = 0; target < n; ++target) {
            num[target] = sc.nextInt();
        }

        System.out.print("Enter Search Element: ");
        target = sc.nextInt();
        int[] var10000 = new int[]{22, 34, 56, 72, 89};
        int index = searchEle(num, target);
        if (index == -1) {
            System.out.println("" + target + " is not present");
        } else {
            System.out.println("" + target + " in this given array at index: " + index);
        }

    }
}

