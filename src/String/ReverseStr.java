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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "TCS";
        reverse(str);

        //Another way to reverse a string by using built-in method
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
