package String;

public class Practise {

    //2. Count length of String without using length() method:
    static int getLengthOfStr(String str){

        char[] chArr = str.toCharArray();
        int count = 0;
        for(char ch : chArr){
            count++;
        }
        return count;
    }

    //3. Count Vowels in String:
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

    //4. Reverse a String:
    static void gerReverseOfString(String str){

        int len = str.length();

        String reverse = "";

        for(int i=len-1; i>=0; i--){
            char ch = str.charAt(i);
            reverse += ch;
        }

        System.out.println(reverse);
    }

    //5. Check String is Palindrome or not:
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

    //6A. Converting string to uppercase without using method:
    static void getUppercaseOfString(String str){

        int len = str.length();

        String newStr = "";

        for(int i=0; i<len; i++){
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - ('a' - 'A'));
            }
            newStr += ch;
        }

        System.out.println(newStr);
    }

    //6B. Converting string into lowercase without using method:
    static void getLowercaseOfString(String str){

        int len = str.length();

        String newStr = "";

        for(int i=0; i<len; i++){

            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char) (ch - ('A' - 'a'));
            }
            newStr += ch;
        }

        System.out.println(newStr);
    }

    //7. Count Consonant in a String:
    static int getCountOfConsonant(String str){

        int len = str.length();
        int count = 0;

        for(int i=0; i<len; i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                count++;
            }
        }
        return count;
    }

    //8. Finding Frequency of a character in a String:
    static void freqOfString(String str){

        int len = str.length();
        int count = 1;

        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }else {
                    count = 1;
                }
            }
            System.out.println(str.charAt(i) + ": " + count);
        }
    }

    //9. Remove Spaces from String:
    static void getRemoveSpaces(String str){

        int len = str.length();

        String newStr = "";

        for(int i=0; i<len; i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                newStr += ch;
            }
        }
        System.out.println(newStr);
    }

    //10. Count word in a Sentence:
    static int getCountOfWord(String str){

        int len = str.length();
        int count = 1;

        for(int i=0; i<len; i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                count++;
            }
        }
        return count;
    }

    //11. Check if string contains only digits:
    static boolean getContainDigit(String str) {

        int len = str.length();

        if (str == null || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < len; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
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

        //6. Converting string to uppercase without using method:
        getUppercaseOfString("uppercase string");
        getLowercaseOfString("LOWERCASE STRING");

        //7. Count Consonant in a String:
        System.out.println("Total count of consonant present in this string are: " + getCountOfConsonant(str));

        //8. Finding Frequency of a character in a String:
        freqOfString("java");

        //9. Remove Spaces from String:
        getRemoveSpaces("Practise in");

        //10. Count word in a Sentence:
        System.out.println(getCountOfWord(str));

        //11. Check if string contains only digits:
        System.out.println("Is string contains only digits: " + getContainDigit("12"));
    }
}
