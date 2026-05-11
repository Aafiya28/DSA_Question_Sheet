package Patterns;

import java.util.Scanner;

public class InvertedPattern {
    //Inverted Triangle Pattern

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = 5;
        int col = 5;

        for(int i=0; i<row; i++){
            for(int j=row; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
