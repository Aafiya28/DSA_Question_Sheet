package Arrays;

public class SingleNumber {

    /* Brute-Force Solution. TC - O(N^2), SC - O(1)*/
    static int singleNum(int[] arr){

        int n = arr.length;

        for (int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(i != j && arr[j] == arr[i]){
                    count++;
                }
            }

            if(count == 0){
                return arr[i];
            }
        }

        return -1;
    }

    /* Better Solution . TC - O(N), SC - O(1)*/
    static int singleNumber(int[] arr){

        int n = arr.length;

        int xor = 0;

        for(int num : arr){
            xor = xor ^ num;
        }

        return xor;
    }

    /* Optima Solution. TC - O(log N), SC - O(1)*/
    static int single_Non_Duplicate(int[] arr){

        int left = 0;
        int right = arr.length-1;

        while (left < right){

            int mid = (left+right)/2;

            if(mid%2 == 1){
                mid--;
            }

            if(arr[mid] == arr[mid+1]){
                left = mid+2;
            }else {
                right = mid;
            }
        }

        return arr[left];
    }

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,4,8,8};

        //Brute-Force Solution
        System.out.println("Brute-Force Solution - Single Num of array: " + singleNum(arr));

        //Better Solution
        System.out.println("Better Solution - Single Num of array: " + singleNumber(arr));

        //Optimal Solution
        int result = single_Non_Duplicate(arr);
        System.out.println("Optimal Solution - Single Non Duplicate : " + result);
    }
}
