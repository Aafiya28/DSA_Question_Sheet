public class MoveZeros {

    static void moveZero(int[] arr, int n){

        for (int i : arr){
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args){

        int[] arr = {34, 67, 36, 98, 56, 72};
        int n =arr.length;

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
