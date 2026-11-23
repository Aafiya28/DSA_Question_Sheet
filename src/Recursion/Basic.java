package Recursion;

public class Basic {

    //Print Number from N to 1
    public static void PrintNto1(int n){

        if(n <= 0) {
            return;
        }
            System.out.println(n);
            PrintNto1(n - 1);

    }

    //Print Number from 1 to N
    public static void Print1toN(int n){

        if( n <= 0){
            return;
        }
            Print1toN(n-1);
            System.out.println(n);

    }

    //Sum of N natural numbers
    public static void sumOfN(int i, int n, int sum){

        if(i == n){
            sum += i;
            System.out.println("Sum of " + n + " Natural Numbers are: " + sum);
            return;
        }

        sum += i;
        sumOfN(i+1, n, sum);
    }

    //Factorial of N
    public static int factorial(int n){

        if(n == 1 || n == 0){
            return 1;
        }

        int fact = n * factorial(n-1);
        return fact;
    }

    //Fibonacci Series
    public static int fibonacciToN(int n){

    }

    public static void main(String[] args) {

        int n = 5;

        PrintNto1(n);
        Print1toN(n);
        sumOfN(1, 5, 0);
        System.out.println("Factorial : " + factorial(n));
    }
}
