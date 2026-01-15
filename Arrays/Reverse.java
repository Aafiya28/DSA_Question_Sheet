public class Reverse {

    static void reverseArr(int[] arr){

        int n = arr.length;

        int low = 0;
        int high = n-1;

        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args){

        int[] arr  = {1,2,3,4,5,6,7,8,9,10};

        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        
        reverseArr(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
