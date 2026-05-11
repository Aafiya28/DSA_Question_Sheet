package Practise_Set;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        System.out.println("Enter some inputs: ");

        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        int simpleI = (p * r * t)/100;

        int amount = simpleI + p;

        System.out.println(simpleI);
        System.out.println("Total amount: " + amount);
    }
}
