package Arrays;

public class Deletion {

    static int deletion(int[] arr, int n, int x){

        int i;

        for(i=0; i<n; i++){
            if(arr[i] == x){
                break;
            }
        }
        if(i == n){
            return n;
        }

        for(int j=i; j<n-1; j++){
            arr[j] = arr[j+1];
        }

        return n-1;
    }

    public static void main(String[] args){

        int[] arr = {23, 45, 67, 84, 89};
        int n = arr.length;

        int x = 84;

        for(int a : arr){
            System.out.print(a + " ");
        }

        System.out.println();

        n = deletion(arr, n, x);

        for(int a=0; a<n; a++){
            System.out.print(arr[a] + " ");
        }

    }
}
