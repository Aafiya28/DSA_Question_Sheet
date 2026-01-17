public class Insertion {

    static int insertEle(int[] arr, int n, int x, int cap, int pos){

        if(n == cap){
            return n;
        }
        int idx = pos-1;

        for(int i = n-1; i>=idx; i--){
            arr[i+1] = arr[i];
        }

        arr[idx] = x;


        return (n+1);
    }

    public static void main(String[] args){

        int[] arr = new int[5];
        int n =3;
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        int cap = arr.length;
        int x = 7;
        int pos = 5;

        n = insertEle(arr, n, x, cap, pos);

        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}
