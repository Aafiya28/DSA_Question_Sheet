package Patterns;

import java.util.Scanner;

public class DiffPyramidPattern {
    //Different Pyramid Pattern

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 5;

        for(int row=1; row<=num; row++){
            for(int j=1; j<=num-row; j++){
                System.out.print("  ");
            }

            for(int col=1; col<=2*row-1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
