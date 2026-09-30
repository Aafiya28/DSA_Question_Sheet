package String;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurChar {

    //Brute force approach TC - O(N^2) SC - O(1);
    static char getMaxOccurChar(String str){

        int len = str.length();

        char maxChar = 'z' + 1;
        int maxCount = -1;

        for(int i=0; i<len; i++){
            char currChar = str.charAt(i);
            int currCount = 0;

            for(int j=0; j<len; j++){
                if(str.charAt(j) == currChar){
                    currCount++;
                }
            }

            if(currCount > maxCount){
                maxCount = currCount;
                maxChar = currChar;
            }else if(currCount == maxCount && currChar < maxChar){
                maxChar = currChar;
            }
        }

        return maxChar;
    }

    static char getMaxOccChar(String str){

        int len = str.length();

        Map<Character, Integer> freqMap = new HashMap<>();

        for(char c : str.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1 );
        }

        int maxCount = -1;
        char maxChar = 'a';

        for(int i=0; i<26; i++){

        }

        return maxChar;
    }

    public static void main(String[] args) {


        String str = "testsample";

        System.out.println("Max Frequency Character : " + getMaxOccurChar(str));
    }
}
