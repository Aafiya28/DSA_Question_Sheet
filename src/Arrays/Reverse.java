package Arrays;

public class Reverse {

        static void reverseArr(int[] arr) {
            int n = arr.length;
            int low = 0;
            int high = n-1;

//            for(int high = n - 1; low < high; --high) {
//                int temp = arr[low];
//                arr[low] = arr[high];
//                arr[high] = temp;
//                ++low;
//            }

            //Two Pointer Method
            while (low < high){

                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }

        public static void main(String[] args) {
            int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            for(int n : arr){
                System.out.print(n + ", ");
            }

            System.out.println();
            reverseArr(arr);

            for(int a : arr){
                System.out.print(a + ", ");
            }
        }

}
