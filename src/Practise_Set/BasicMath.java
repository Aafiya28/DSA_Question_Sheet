package Practise_Set;

public class BasicMath {

    static void printNum(int num){

        while (num != 0){
            int digit = num%10;
            System.out.print(digit + ", ");
            num = num/10;
        }
        System.out.println();
    }

    static int countDigit(int num){

        int count = 0;
        while (num != 0){
            int digit = num%10;
            count++;
            num = num/10;
        }
        return count;
    }

    static int sumOfDigit(int num){

        int sum = 0;

        while (num != 0){
            int digit = num%10;
            sum += digit;
            num = num/10;
        }
        return sum;
    }

    static void reverseDigits(int num){

        int reverse = 0;

        while (num != 0){
            int digit = num%10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        System.out.println(reverse);;
    }

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

    static boolean isPrime(int num){

        for(int i=2; i*i<=num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    static int getGCD(int a, int b){

        while (b != 0){

            int oldValueOfB = b;
            b = a%b;
            a = oldValueOfB;
        }
        int ans = a;

        return ans;
    }

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

    static boolean checkPerfectNumber(int num){

        int sum = 1;

        for(int i=2; i*i<=num; i++){
            if(num%i == 0){
                int firstFector = i;
                int secondFector = num/i;
                sum += firstFector + secondFector;
            }
        }

        if(sum == num){
            return true;
        }else {
            return false;
        }
    }

    static void getAllDivisor(int num){

        for(int i=1; i*i <=num; i++){
            if(num%i == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println();
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

        System.out.println("GCD/HCF of " + 24 + " & " + 12 + " is: " + getGCD(24, 12));

        System.out.println("LCM of 24 & 12 is: " + getLCM(24, 12));

        System.out.println("Is 155 armstrong number: " + isArmstrong(155));

        System.out.println("Is 6 Perfect Number: " + checkPerfectNumber(8));

        getAllDivisor(7);
    }
}
