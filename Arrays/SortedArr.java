public class SortedArr {

    //Sorted An Array
    static void sorted(int[] arr){

        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {3, 2, 7, 5, 10, 4, 6, 9};

        sorted(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
