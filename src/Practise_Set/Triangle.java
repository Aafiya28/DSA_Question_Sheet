package Practise_Set;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side of a triange: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int parameter = a + b + c;

        System.out.println("Parameter of Triange which side's are : " + a + ", " + b + ", " + c + " is: " + parameter);
    }
}
