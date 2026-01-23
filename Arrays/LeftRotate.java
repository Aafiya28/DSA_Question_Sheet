import java.util.Scanner;

public class LeftRotate {

    //Left Rotate By One Place
    static void leftRotateOne(int[] arr ){

        int n = arr.length;
        int temp = arr[0];

        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }

        arr[n-1] = temp;
    }

    //Left Rotate By K Places
    static void leftRotateByKPlace(int[] arr, int k){

        int n = arr.length;
        int[] temp = new int[k];

        for(int i=0; i<k; i++){
            temp[i] = arr[i];
        }

        for(int i=k; i<n; i++){
            arr[i-k] = arr[i];
        }

        for(int i=0; i<k; i++){
            arr[n-k+i] = temp[i];
        }
    }

    public static void main(String[] args){

        int[] arr = {10, 20, 30, 40};

        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();

        leftRotateOne(arr);

        // After One Place Rotation
        for (int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers of element of array list: ");
        int m = sc.nextInt();
        int[] nums = new int[m];

        for(int i=0; i<m; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter " + m + " element in array list: ");

        System.out.print("Enter number of place of element rotation : ");
        int k = sc.nextInt();

        leftRotateByKPlace(arr, k);

//        System.out.print("After Rotation New Array List is: ");

        //After K Place Rotation
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
