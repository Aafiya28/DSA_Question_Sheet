package Arrays;

public class RemoveDublicate {

    static int remDups(int arr[], int n)
    {
        int res = 1;

        for(int i = 1; i < n; i++){
            if(arr[res - 1] != arr[i]){
                arr[res] = arr[i];
                res++;
            }
        }

        return res;
    }

    public static void main(String args[])
    {
        int arr[] = {10, 20, 20, 30, 30, 30}, n = 6;

        System.out.println("Before Removal");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        n = remDups(arr, n);

        System.out.println("After Removal");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    public static class Second_Largest {

        //Find Second Largest Element in an Array
        static int secondLargest(int[] arr) {

            int n = arr.length;
            int largest = Integer.MIN_VALUE;
            int seconde = Integer.MIN_VALUE;

            for(int i=0; i<n; i++){
                if(arr[i] > largest) {
                    seconde = largest;
                    largest = arr[i];
                } else if (arr[i] < largest && arr[i] > seconde) {
                    seconde = arr[i];
                }

            }

            return (seconde == Integer.MIN_VALUE) ? -1 : seconde;
        }

        public static void main(String[] args){

            int[] arr = {3, 6, 2, 4, 9, 17, 8, 12};

            int secondLargest = secondLargest(arr);

            System.out.println("Seconde Largest Element of Array is: " + secondLargest);
        }
    }
}
