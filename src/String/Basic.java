package String;

import com.sun.source.doctree.SummaryTree;

import java.util.Locale;

public class Basic {

    public static void main(String[] args){

        String s1 = "Aiman Sheikh";
        String s2 = "   aiman sheikh   ";

        System.out.println("Length of s1: " + s1.length());

        System.out.println("Index of `e` in s1: " + s1.indexOf('e'));

        System.out.println("In index 2 character present in s1 is: " + s1.charAt(2));

        System.out.println("s1 subString from indexes 3 to 8 are: " + s1.substring(3, 8));

        System.out.println("Is s1 contain `man` : "+ s1.contains("man"));

        System.out.println("Is s1 & s2 equal: " + s1.equals(s2));

        System.out.println("Is s1 & s2 equal by ignore case: " + s1.equalsIgnoreCase(s2));

        System.out.println("Convert s2 into Uppercase: " + s2.toUpperCase());

        System.out.println("Convert s1 into lowercase: " + s1.toLowerCase());

        System.out.println("Before trim length of s2 is: " + s2.length() + " After trim length of s2 is: " + s2.trim().length());

        System.out.print("After applying `Split` method: ");

        String str = "My,name,is,Aafiya,Afroz";

        String[] words = str.split(",");

        for (String st : words){
            System.out.print(st + " ");
        }
        System.out.println();

        System.out.println("Is str is startsWith `My` word: " + str.startsWith("My"));

        System.out.println("Is str is endsWith `roz` word: " + str.endsWith("soz"));

        int num = 5432;

        String Snum = String.valueOf(num);

        System.out.println(num + " + 1 is: " +num + 1 + " & After converting num into String / using valueOf() method then "+ Snum + " + 1 is: " + Snum + 1 + " Strings are concat & not add" );

        System.out.println("Converting String into array with the help of toCharArr method: ");

        char[] chArr = str.toCharArray();

        System.out.print("[ ");
        for(char ch : chArr){
            System.out.print(ch);
        }
        System.out.println(" ]");

        String s3 = "  ";

        System.out.println("Is s3 is empty: " + s3.isEmpty() + " Because isEmpty() method not consider spaces");

        System.out.println("Is s3 is blank: " + s3.isBlank() + " Because isBlank() method consider spaces & empty cases as well as");

        String name = "Aman";
        System.out.println("Before using replace() method Name: " + name);
        name = name.replace('n', 'l');
        System.out.println("After Using replaces() in String replace `n` to `l` Name: " + name);
    }
}
