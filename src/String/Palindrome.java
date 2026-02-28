package String;

import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(String str){

        int n = str.length();
        int left = 0;
        int right = n-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        boolean result = isPalindrome(str);

        System.out.println(str + " is palindrome: " + result);
    }
}
