package Patterns;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows and columns for Triangle Pattern: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Reverse Right Triangle");
        //Reverse Right Triangle
        int num = 5;

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
