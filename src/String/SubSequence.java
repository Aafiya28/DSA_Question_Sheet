package String;

public class SubSequence {

    static boolean subSeq(String s1, String s2){

        int n = s1.length();
        int m = s2.length();

        int j=0;

        for(int i=0; i<n && j<m; i++){
            if(s1.charAt(i) == s2.charAt(j)){
                j++;
            }
        }
        return (j==m);
    }

    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "abd";

        System.out.println(subSeq(s1, s2));
    }
}
