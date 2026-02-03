package Arrays;

import java.util.Scanner;

public class EquilibriumPoint {

    //Naive solution
    static boolean equlPointN(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int ls = 0;
            int rs = 0;
            for (int j = 0; j < i; j++) {
                ls += arr[j];
            }
            for (int k = i + 1; k < n; k++) {
                rs += arr[k];
            }
            if (ls == rs) {
                return true;
            }
        }
        return false;
    }

    static boolean equlPointE(int[] arr) {

        int n = arr.length;

        int rs = 0;

        for (int i = 0; i < n; i++) {
            rs += arr[i];
        }

        int ls = 0;
        for (int i = 0; i < n; i++) {
            rs -= arr[i];

            if (ls == rs) {
                return true;
            }
            ls += arr[i];
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ansN = equlPointN(arr);
        boolean ansE = equlPointE(arr);

        System.out.println("By Naive Solution checking equilibrium point present or not");
        System.out.println("Equilibrium Point: " + ansN);
        System.out.println();
        System.out.println("By Efficient Solution checking equilibrium point present or not: ");
        System.out.println("Equilibrium Point: " + ansE);
    }

}