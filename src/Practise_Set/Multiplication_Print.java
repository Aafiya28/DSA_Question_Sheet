package Practise_Set;

import java.util.Scanner;

public class Multiplication_Print {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two number to multiplication: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int multi = a * b;

        System.out.println("Multiplication of " + a + " & " + b + " is: " + multi);
    }
}
