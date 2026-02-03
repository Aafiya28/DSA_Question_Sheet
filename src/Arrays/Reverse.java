package Arrays;

public class Reverse {

        static void reverseArr(int[] arr) {
            int n = arr.length;
            int low = 0;

            for(int high = n - 1; low < high; --high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                ++low;
            }

        }

        public static void main(String[] args) {
            int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] var2 = arr;
            int var3 = arr.length;

            int var4;
            int num;
            for(var4 = 0; var4 < var3; ++var4) {
                num = var2[var4];
                System.out.print("" + num + " ");
            }

            System.out.println();
            reverseArr(arr);
            var2 = arr;
            var3 = arr.length;

            for(var4 = 0; var4 < var3; ++var4) {
                num = var2[var4];
                System.out.print("" + num + " ");
            }

        }

}
