package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class All_Palindrome {

    static boolean isPalindrome(int num){

        if(num < 0) return false;

        if(num < 10 && num > 0) return true;

        int rev = 0;
        int temp = num;

        while(temp  > 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        return num == rev;
    }

    static ArrayList<Integer> findallPalindrome(int L, int R){

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=L; i<R; i++){
            if(isPalindrome(i)){
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(75));

        Scanner sc = new Scanner(System.in);    // not used in this code, declare for future cases!

        int L = 10;
        int R = 120;

        ArrayList<Integer> palindromeRange = findallPalindrome(L, R);

        for(int i : palindromeRange){
            System.out.print(i + ", ");
        }

    }
}
