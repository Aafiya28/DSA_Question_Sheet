import java.util.Scanner;

public class MinimumConsecutive {

    static void minConnsecutive(int[] arr){

        int n=arr.length;

        for(int i=1; i<n; i++){
            if(arr[i] != arr[i-1]){
                if(arr[i] != arr[0]){
                    System.out.print("From " + i + " to ");
                }else {
                    System.out.println(i-1);
                }
            }
        }

        if(arr[n-1] != arr[0]){
            System.out.println(n-1);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. element in array: ");
        int n = sc.nextInt();

        int[] arr  = new int[n];
        System.out.print("Enter element's in array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        minConnsecutive(arr);
    }
}
