public class Second_Largest {

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
