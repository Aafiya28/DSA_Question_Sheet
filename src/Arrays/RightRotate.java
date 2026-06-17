package Arrays;

public class RightRotate {

    //Right Rotate By One Place
    static void rightRotate(int[] arr){

        if(arr == null || arr.length < 1){
            return;
        }

        int n = arr.length;
        int temp = arr[n-1];

        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = temp;
    }

    static void kThRightRotation(int[] arr, int k){

        // k = Number to place to shift elements of an array
        int n = arr.length;

        if(arr == null || k == 0 || n<1){
            return;
        }

        int[] temp = new int[k];


        for(int i=0; i<k; i++){
            temp[i] = arr[n-k+i];
        }

        for(int j=n-1-k; j>=0; j--){
            arr[j+k] = arr[j];
        }

        for(int i=0; i<k; i++){
            arr[i] = temp[i];
        }

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5};

        rightRotate(arr);

        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();

        int[] num = {10, 20, 30, 40, 50};

        kThRightRotation(num, 2);
        for(int a : num){
            System.out.print(a + " ");
        }
    }
}
