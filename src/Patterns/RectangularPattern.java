package Patterns;

import java.util.Scanner;

public class RectangularPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. or rows & columns for Rectangular Pattern: ");

        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
