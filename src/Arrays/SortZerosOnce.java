package Arrays;

public class SortZerosOnce {

    //Sort 0s and 1s
    static void sort(int[] arr){
        int n = arr.length;

        int left = 0;
        int right = n-1;

        while (left < right){

            while (arr[left] == 0 && left < right){
                left++;
            }
            while (arr[right] == 1 && left < right) {
                right--;
            }
            if(left < right){
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 0, 1};

        sort(arr);

        for(int a : arr){
            System.out.print(a + " ");
        }

    }
}
