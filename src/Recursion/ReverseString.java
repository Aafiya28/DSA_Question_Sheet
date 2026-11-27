package Recursion;

public class ReverseString {

    static void reverseStr(String str){

        if(str.length() == 0){
            System.out.println("String is empty");;
        }

        int len = str.length();
        String rev = "";

        for( int i=len-1; i>=0; i--){
            char ch = str.charAt(i);
            rev += ch;
        }

        System.out.println(rev);
    }

    static void reverseString(String str, int idx){

        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        reverseString(str, idx-1);
    }

    public static void main(String[] args) {

        String str = "abcd";
        System.out.println("Actual String before reverse : " + str);

        System.out.print("After reverse by using Iterative Function : ");
        reverseStr(str);

        System.out.print("By using Recursion Function : ");
        reverseString(str, str.length()-1);
    }
}
