package Arrays;

import java.util.Scanner;

public class Palindrome {

    //Recursion Function to Check if a String is palindrome or not
    static boolean isPalindromeString(String str, int l, int r){

        if(l > r) return true;

        if(str.charAt(l) != str.charAt(r)){
                return false;
        }

        return isPalindromeString(str, l+1, r-1);
    }

    static boolean isPalindrome(int num){

        int rev = 0;
        int temp = num;

        if(num < 0) return false;
        if(num < 10) return true;

        while (temp > 0){
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp/10;
        }

        return rev == num;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check is a palindrome or not: ");
        int num = sc.nextInt();


        boolean result = isPalindrome(num);

        if(result == true){
            System.out.println(num + " is palindrome");
        }else {
            System.out.println(num + " is not palindrome");
        }

        String str = "madam";
        boolean ans = isPalindromeString(str, 0, str.length()-1);

        System.out.println("Is Palindrome: " + ans);
    }
}
