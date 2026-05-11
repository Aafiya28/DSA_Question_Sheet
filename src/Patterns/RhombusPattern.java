package Patterns;

import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int row = sc.nextInt();
//        int col = sc.nextInt();
        int row = 5;
        int col = 9;

        for(int i=0; i<=row; i++){
            for(int j=row-i; j>0; j--){
                System.out.print(" ");
            }

            for(int k=0; k<=row; k++){
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
