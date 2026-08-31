package Arrays;

public class Sort_Color {

    //Optimal Solution
    static void sortColor(int[] arr){

        int n = arr.length;

        int low = 0;
        int mid = 0;
        int high = n-1;

        while (mid <= high){

            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }else if(arr[mid] == 1){
                mid++;
            }else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {2,0,2,1,1,0};

        sortColor(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
