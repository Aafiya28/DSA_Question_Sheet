package String;

public class Practise {

    static int getLengthOfStr(String str){

        char[] chArr = str.toCharArray();
        int count = 0;
        for(char ch : chArr){
            count++;
        }
        return count;
    }

    static int getCountVowels(String str){

        int len = str.length();
        int count = 0;

        for(int i=0; i<len; i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }

    static void gerReverseOfString(String str){

        int len = str.length();

        String reverse = "";

        for(int i=len-1; i>=0; i--){
            char ch = str.charAt(i);
            reverse += ch;
        }

        System.out.println(reverse);
    }

    static boolean getPalindrome(String str){

        int len = str.length();

        if(str == null){
            return false;
        }

        int left = 0;
        int right = len-1;

        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "Practise in Java";
        int n = str.length();

        //1. Printing each character of the String:
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            System.out.print (ch + " ");
        }
        System.out.println();

        //2. Count length of String without using length() method:
        System.out.println("Without using length() method finding length of a string: ");
        System.out.println("Length of `" + str + "` is: " + getLengthOfStr(str));

        //3. Count Vowels in String:
        System.out.println("Count Vowels present in this string are: " + getCountVowels(str));

        //4. Reverse a String:
        gerReverseOfString(str);

        //5. Check String is Palindrome or not:
        System.out.println(getPalindrome("noon"));
    }
}
