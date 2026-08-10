package Arrays;

public class SingleNonDuplicate {

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

        int result = single_Non_Duplicate(arr);

        System.out.println("Single Non Duplicate : " + result);
    }
}
