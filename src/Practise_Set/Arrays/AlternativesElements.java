package Practise_Set.Arrays;

public class AlternativesElements {

    //Swap Alternatives elements in array:
    static int[] getAlternativeEle(int[] arr){

        int n = arr.length;

        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        int[] result = getAlternativeEle(arr);

        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
