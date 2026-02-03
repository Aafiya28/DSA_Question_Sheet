package Arrays;

public class MoveZeros {

    static void moveZero(int[] arr){

        int n = arr.length;
        int count = 0;

        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public static void main(String[] args){

        int[] arr = {34, 0, 64, 43, 0, 0, 25, 78};
        int n =arr.length;

        moveZero(arr);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
