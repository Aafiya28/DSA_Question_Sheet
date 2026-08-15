package Binary_Search;

public class Occurrence {

    /* First and Last Occurrence */

    static int[] firstAndLast(int[] arr, int target){

        int n=arr.length;

        int first = -1;
        int last = -1;

        for(int i=0; i<n; i++){
            if(arr[i] == target){
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }

        return new int[] {first, last};
    }

    public static void main(String[] args) {

        int[] arr = {3,4,6,13,13,13,20,40};
        int target = 13;

        int[] result = firstAndLast(arr, target);

        for(int num : result){
            System.out.print(num + ", ");
        }
    }
}
