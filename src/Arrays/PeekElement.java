package Arrays;

public class PeekElement {

    static int peekEleIdx(int[] arr){

        int n=arr.length;

        int peek = 0;

        for(int i=1; i<n; i++){
            if(arr[i] > arr[peek]){
                peek = i;
            }
        }

        return peek;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 2};

        System.out.println("Peek Element Index : " + peekEleIdx(arr));
    }
}
