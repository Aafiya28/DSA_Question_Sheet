package Practise_Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BasicMath {

    //1.
    static void printNum(int num){

        while (num != 0){
            int digit = num%10;
            System.out.print(digit + ", ");
            num = num/10;
        }
        System.out.println();
    }

    //2.
    static int countDigit(int num){

        int count = 0;
        while (num != 0){
            int digit = num%10;
            count++;
            num = num/10;
        }
        return count;
    }

    //3.
    static int sumOfDigit(int num){

        int sum = 0;

        while (num != 0){
            int digit = num%10;
            sum += digit;
            num = num/10;
        }
        return sum;
    }

    //4.
    static void reverseDigits(int num){

        int reverse = 0;

        while (num != 0){
            int digit = num%10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        System.out.println(reverse);;
    }

    //5.
    static boolean palindromeCheck(int num){

        int original = num;
        int reverse = 0;

        while (num != 0){
            int digit = num%10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }

        if(reverse == original){
            return true;
        }
        System.out.println(reverse  + " & " + original);
        return false;
    }

    //6.
    static boolean isPrime(int num){

        for(int i=2; i*i<=num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    //7.
    static void allPrimeNum(int num){

        for(int i=2; i<=num; i++){
            boolean isPrime = true;

            for(int j=2; j*j<=i; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                System.out.print(i + " ");
            }
        }
    }

    //8.
    static int getGCD(int a, int b){

        while (b != 0){

            int oldValueOfB = b;
            b = a%b;
            a = oldValueOfB;
        }
        int ans = a;

        return ans;
    }

    //9.
    static long getLCM(int a, int b){

        int originalA = a;
        int originalB = b;

        while (b != 0){
            int oldValueOfB = b;
            b = a%b;
            a = oldValueOfB;
        }

        return ((long) originalA * originalB) / a ;
    }

    //10.
    static boolean isArmstrong(int num){

        int originalNum = num;
        int sum = 0;

        while (num != 0){

            int digit = num%10;
            sum  +=  digit * digit * digit;;
            num = num/10;
        }

        if(originalNum == sum){
            return true;
        }
        return false;
    }

    //11.
    static boolean checkPerfectNumber(int num){

        int sum = 1;

        for(int i=2; i*i<=num; i++){

            // M1. method
            if (num % i == 0) {
                sum += i;
                // Avoid double-counting the square root of a perfect square
                if (i * i != num) {
                    sum += num / i;
                }
            }

            //
            // M2. Method
//            if(num%i == 0){
//                int firstFector = i;
//                int secondFector = num/i;
//                sum = sum + firstFector + secondFector;
//            }
        }

        if(sum == num){
            return true;
        }else {
            return false;
        }
    }

    //12.
    static void getAllDivisor(int num){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);

        for(int i=2; i*i<=num; i++){
            if(num%i == 0){
                list.add(i);

                if(i != num/i){
                    list.add(num/i);
                }
            }
        }

        if(num != 1){
            list.add(num);
        }

        Collections.sort(list);

        System.out.println("All Divisor of " + num + " are: " + list);
    }

    //13.
    static void factorial(int num){

        int fact = 1;

        for(int i=2; i<=num; i++){
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }

    //14.
    static int powerNum(int num, int power){

        int ans = 1;

        for(int i=1; i<=power; i++){
            ans = ans * num;
        }

        return ans;
    }

    public static void main(String[] args) {

        int num = 1498;

        printNum(num);
        System.out.println("Total digits in " + num + " are: " + countDigit(num));

        System.out.println("Sum of all digits of " + num  + " is: " + sumOfDigit(num));

        System.out.print("Reverse of " + num + " is: ");
        reverseDigits(num);

        System.out.println(num + " is palindrome: " + palindromeCheck(5445));

        System.out.println("Check is" + 12 + " is prime number: " + isPrime(11));

        int n = 20;
        System.out.print("All Prime number form 1 to "+ n + " are: " );
        allPrimeNum(n);
        System.out.println();

        System.out.println("GCD/HCF of " + 24 + " & " + 12 + " is: " + getGCD(24, 12));

        System.out.println("LCM of 24 & 12 is: " + getLCM(24, 12));

        System.out.println("Is 155 armstrong number: " + isArmstrong(155));

        System.out.println("Is 6 Perfect Number: " + checkPerfectNumber(6));

        getAllDivisor(35);

        factorial(5);

        System.out.println(2 + "^" + 5 + " is: " + powerNum(2, 5) );
    }
}
