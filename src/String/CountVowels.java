package String;

import java.util.Scanner;

public class CountVowels {

    //count vowels in given String
    static int vowels(String str){

        int vowels = 0;

        for(int i=0; i<str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
        }

        return vowels;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String  str = "This is a sentence";

        int vowels = vowels(str);

        System.out.println("No. of vowels in this sentence are: " + vowels);
    }
}
