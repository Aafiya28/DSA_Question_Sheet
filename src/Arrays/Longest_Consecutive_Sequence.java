package Arrays;

public class Longest_Consecutive_Sequence {

    //Brute-force approach - TC:
    static int longestConsecutiveSeq(int[] arr){

        if(arr == null || arr.length == 0){
            return -1;
        }
        int n = arr.length;
        int len = 1;

        for(int i=0; i<n; i++){
            int x = arr[i]+1;
            while(i < n){
                if(arr[i] == x){
                    len++;
                }
            }
        }
        // To be continue---------------
        return len;
    }

    public static void main(String[] args) {

        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1};
    }
}
