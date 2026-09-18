package String;

import java.util.Scanner;

public class ReverseStr {

    static void reverse(String str){

        String rev = "";

        for(int i = str.length()-1; i >= 0; i--){
            rev += str.charAt(i);
        }

        System.out.println("Reverse string of given " + str + " is: " + rev);
    }

    //Brute force solution
    static String reverseStr(String str){

        int len = str.length();

        str = str.trim();

        String[] words = str.split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "TCS";
        reverse(str);

        //Another way to reverse a string by using built-in method
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

        System.out.println(reverseStr("     My name is Sadaf     "));
    }
}
