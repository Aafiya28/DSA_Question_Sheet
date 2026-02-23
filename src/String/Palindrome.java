package String;

import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(String str){



        return false;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        boolean result = isPalindrome(str);

        System.out.println(str + " is palindrome: " + result);
    }
}
