package Arrays;

class Largest_Element {
    
    static int largest(int[] arr){

        int n = arr.length;

        int largest = arr[0];

        for(int i=1; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int[] arr = {2, 6, 23, 7, 12, 9, 16};

        int largest_value = largest(arr);

        System.out.println("Largest value of this array: " + largest_value);
    }
}
