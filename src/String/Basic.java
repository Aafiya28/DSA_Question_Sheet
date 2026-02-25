package String;

public class Basic {

    public static void main(String[] args){

        String s1 = "geeks";
        String  s2 = "geeksforgeeks";

        System.out.println(s1.length());
        System.out.println(s1.charAt(3));
        System.out.println(s1.contains("s"));
        System.out.println(s1.split("ge", 2));

        System.out.println(s1.substring(2));

        for(int i=0; i<s1.length(); i++){
            System.out.print(s1.charAt(i) + " appear at ");
            System.out.println((int)s1.charAt(i) - 'a' + " times ");
        }

        System.out.println((int)'a');

        System.out.println((int)s1.charAt(0));

        System.out.println(s2.contains(s1));
        System.out.println(s2 == s1);
        System.out.println(s2.equals(s1));
        System.out.println(s2.concat(s1));
        System.out.println(s2.indexOf(s1, 1));
    }
}
